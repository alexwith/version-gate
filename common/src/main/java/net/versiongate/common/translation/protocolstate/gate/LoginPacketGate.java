package net.versiongate.common.translation.protocolstate.gate;

import net.versiongate.api.connection.IConnection;
import net.versiongate.api.enums.ProtocolState;
import net.versiongate.api.packet.IPacket;
import net.versiongate.common.gate.gate.PacketGate;
import net.versiongate.common.translation.protocolstate.type.login.InboundPacketLogin;
import net.versiongate.common.translation.protocolstate.type.login.OutboundPacketLogin;

public class LoginPacketGate extends PacketGate {

    @Override
    public void load() {
        this.packetConsumer(InboundPacketLogin.LOGIN_START, (packet) -> {
            if (true) { // isn't on a blocked version
                return;
            }

            packet.cancel();

            final IPacket newPacket = this.createPacket(packet.getConnection(), OutboundPacketLogin.DISCONNECT);
            // TODO: this is where we block them in the future if they're on an unwanted version
        });

        this.packetConsumer(OutboundPacketLogin.LOGIN_SUCCESS, (packet) -> {
            final IConnection connection = packet.getConnection();
            connection.setProtocolState(ProtocolState.PLAY);
        });
    }
}
