package net.versiongate.common.translation.version1_8;

import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.translation.IPacketType;

public enum OutboundIPacket1_8 implements IPacketType {

    KEEP_ALIVE(0x00),
    JOIN_GAME(0x01),
    CHAT_MESSAGE(0x02),
    TIME_UPDATE(0x03),
    ENTITY_EQUIPMENT(0x04),
    SPAWN_POSITION(0x05),
    UPDATE_HEALTH(0x06),
    RESPAWN(0x07),
    PLAYER_POSITION(0x08),
    HELD_ITEM_CHANGE(0x09),
    USE_BED(0x0A),
    ENTITY_ANIMATION(0x0B),
    SPAWN_PLAYER(0x0C),
    COLLECT_ITEM(0x0D),
    SPAWN_ENTITY(0x0E),
    SPAWN_MOB(0x0F),
    SPAWN_PAINTING(0x10),
    SPAWN_EXPERIENCE_ORB(0x11),
    ENTITY_VELOCITY(0x12),
    DESTROY_ENTITIES(0x13),
    ENTITY_MOVEMENT(0x14),
    ENTITY_POSITION(0x15),
    ENTITY_ROTATION(0x16),
    ENTITY_POSITION_AND_ROTATION(0x17),
    ENTITY_TELEPORT(0x18),
    ENTITY_HEAD_LOOK(0x19),
    ENTITY_STATUS(0x1A),
    ATTACH_ENTITY(0x1B),
    ENTITY_METADATA(0x1C),
    ENTITY_EFFECT(0x1D),
    REMOVE_ENTITY_EFFECT(0x1E),
    SET_EXPERIENCE(0x1F),
    ENTITY_PROPERTIES(0x20),
    CHUNK_DATA(0x21),
    MULTI_BLOCK_CHANGE(0x22),
    BLOCK_CHANGE(0x23),
    BLOCK_ACTION(0x24),
    BLOCK_BREAK_ANIMATION(0x25),
    MAP_BULK_CHUNK(0x26),
    EXPLOSION(0x27),
    EFFECT(0x28),
    NAMED_SOUND(0x29),
    SPAWN_PARTICLE(0x2A),
    GAME_EVENT(0x2B),
    SPAWN_GLOBAL_ENTITY(0x2C),
    OPEN_WINDOW(0x2D),
    CLOSE_WINDOW(0x2E),
    SET_SLOT(0x2F),
    WINDOW_ITEMS(0x30),
    WINDOW_PROPERTY(0x31),
    WINDOW_CONFIRMATION(0x32),
    UPDATE_SIGN(0x33),
    MAP_DATA(0x34),
    BLOCK_ENTITY_DATA(0x35),
    OPEN_SIGN_EDITOR(0x36),
    STATISTICS(0x37),
    PLAYER_INFO(0x38),
    PLAYER_ABILITIES(0x39),
    TAB_COMPLETE(0x3A),
    SCOREBOARD_OBJECTIVE(0x3B),
    UPDATE_SCORE(0x3C),
    DISPLAY_SCOREBOARD(0x3D),
    TEAMS(0x3E),
    PLUGIN_MESSAGE(0x3F),
    DISCONNECT(0x40),
    SERVER_DIFFICULTY(0x41),
    COMBAT_EVENT(0x42),
    CAMERA(0x43),
    WORLD_BORDER(0x44),
    TITLE(0x45),
    SET_COMPRESSION(0x46),
    TAB_LIST(0x47),
    RESOURCE_PACK(0x48),
    UPDATE_ENTITY_NBT(0x49);

    private final int id;

    OutboundIPacket1_8(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public PacketBound getPacketBound() {
        return PacketBound.OUT;
    }
}
