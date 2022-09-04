package net.versiongate.common.translation.version1_8.type;

import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.packet.IPacketType;

public enum InboundPacket1_8 implements IPacketType {

    KEEP_ALIVE(0x00),
    CHAT_MESSAGE(0x01),
    INTERACT_ENTITY(0x02),
    PLAYER_MOVEMENT(0x03),
    PLAYER_POSITION(0x04),
    PLAYER_ROTATION(0x05),
    PLAYER_POSITION_AND_ROTATION(0x06),
    PLAYER_DIGGING(0x07),
    PLAYER_BLOCK_PLACEMENT(0x08),
    HELD_ITEM_CHANGE(0x09),
    ANIMATION(0x0A),
    ENTITY_ACTION(0x0B),
    STEER_VEHICLE(0x0C),
    CLOSE_WINDOW(0x0D),
    CLICK_WINDOW(0x0E),
    WINDOW_CONFIRMATION(0x0F),
    CREATIVE_INVENTORY_ACTION(0x10),
    CLICK_WINDOW_BUTTON(0x11),
    UPDATE_SIGN(0x12),
    PLAYER_ABILITIES(0x13),
    TAB_COMPLETE(0x14),
    CLIENT_SETTINGS(0x15),
    CLIENT_STATUS(0x16),
    PLUGIN_MESSAGE(0x17),
    SPECTATE(0x18),
    RESOURCE_PACK_STATUS(0x19);

    private final int id;

    InboundPacket1_8(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public PacketBound getPacketBound() {
        return PacketBound.IN;
    }
}
