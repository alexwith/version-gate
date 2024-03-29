package net.versiongate.api.connection;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.enums.ProtocolState;
import net.versiongate.api.gate.version.ProtocolVersion;

public interface IConnection {

    Channel getChannel();

    ProtocolVersion getProtocolVersion();

    void setProtocolVersion(int protocolVersion);

    ProtocolState getProtocolState();

    void setProtocolState(ProtocolState protocolState);

    /**
     * Disconnects the connection
     */
    void disconnect();

    /**
     * Starts and ends the translation pipeline
     *
     * @param buffer The buffer allocated by the pipeline codec
     * @param bound  Where the packet is bound.
     */
    void translate(ByteBuf buffer, PacketBound bound);

    /**
     * If the connection should translate packets or not
     *
     * @return If it should translate
     */
    boolean shouldTranslate();
}
