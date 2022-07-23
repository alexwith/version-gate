package net.versiongate.common.translation.protocolstate.status;

import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.enums.ProtocolState;
import net.versiongate.api.translation.IPacketType;

public enum InboundIPacketStatus implements IPacketType {

    STATUS_REQUEST(0x00),
    PING_REQUEST(0x01);

    private final int id;

    InboundIPacketStatus(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public PacketBound getPacketBound() {
        return PacketBound.IN;
    }

    @Override
    public ProtocolState getStateApplication() {
        return ProtocolState.STATUS;
    }
}
