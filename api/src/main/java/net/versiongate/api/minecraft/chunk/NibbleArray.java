package net.versiongate.api.minecraft.chunk;

import java.util.Arrays;

public class NibbleArray {
    private final byte[] handle;

    public NibbleArray(int length) {
        if (length == 0 || length % 2 != 0) {
            throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
        }

        this.handle = new byte[length / 2];
    }

    public NibbleArray(byte[] handle) {
        if (handle.length == 0 || handle.length % 2 != 0) {
            throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
        }

        this.handle = handle;
    }

    public byte[] getHandle() {
        return this.handle;
    }

    public void setHandle(byte[] handle) {
        if (handle.length != this.handle.length) {
            throw new IllegalArgumentException("Length of handle must equal to size of nibble array!");
        }

        System.arraycopy(handle, 0, this.handle, 0, handle.length);
    }

    public byte get(int x, int y, int z) {
        return this.get(IChunkSection.sectionIndex(x, y, z));
    }

    public byte get(int index) {
        final byte value = this.handle[index / 2];
        return index % 2 == 0 ? (byte) (value & 0xF) : (byte) ((value >> 4) & 0xF);
    }

    public void set(int x, int y, int z, int value) {
        this.set(IChunkSection.sectionIndex(x, y, z), value);
    }

    public void set(int index, int value) {
        if (index % 2 == 0) {
            index /= 2;
            this.handle[index] = (byte) ((this.handle[index] & 0xF0) | (value & 0xF));
            return;
        }

        index /= 2;
        this.handle[index] = (byte) ((this.handle[index] & 0xF) | ((value & 0xF) << 4));
    }

    public int size() {
        return this.handle.length * 2;
    }

    public int actualSize() {
        return this.handle.length;
    }

    public void fill(byte value) {
        value &= 0xF; // Max nibble size (= 16)
        Arrays.fill(this.handle, (byte) ((value << 4) | value));
    }
}