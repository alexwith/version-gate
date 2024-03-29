package net.versiongate.common.translation.protocolstate.gate;

import net.versiongate.api.buffer.BufferAdapter;
import net.versiongate.api.connection.IConnection;
import net.versiongate.api.enums.ProtocolState;
import net.versiongate.common.gate.gate.PacketGate;
import net.versiongate.common.translation.protocolstate.type.handshaking.InboundPacketHandshaking;

public class HandshakePacketGate extends PacketGate {

    @Override
    public void load() {
        this.packetConsumer(InboundPacketHandshaking.HANDSHAKE, (packet) -> {
            packet.schema(
                BufferAdapter.VAR_INT,
                BufferAdapter.STRING,
                BufferAdapter.UNSIGNED_SHORT,
                BufferAdapter.VAR_INT
            );

            final int connectionProtocol = packet.readField(0);
            final int state = packet.readField(3);

            final IConnection connection = packet.getConnection();
            connection.setProtocolVersion(connectionProtocol);
            connection.setProtocolState(ProtocolState.values()[state]);

            final int serverProtocol = this.gateManager.getProtocolVersion().getId();
            packet.writeField(0, serverProtocol);
        });
    }
}
