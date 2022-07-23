package net.versiongate.common.translation.protocolstate.login;

import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.enums.ProtocolState;
import net.versiongate.api.translation.IPacketType;

public enum InboundIPacketLogin implements IPacketType {

    LOGIN_START(0x00),
    ENCRYPTION_RESPONSE(0x01),
    LOGIN_PLUGIN_RESPONSE(0x02);

    private final int id;

    InboundIPacketLogin(int id) {
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
        return ProtocolState.LOGIN;
    }
}
