package net.versiongate.api.packet;

import net.versiongate.api.enums.PacketBound;
import net.versiongate.api.enums.ProtocolState;

public interface IPacketType {

    /**
     * Get the name of the enum to be used to compare packets between versions
     *
     * @return The name of the enum
     */
    String getName();

    /**
     * Get the packet id
     *
     * @return The packet id
     */
    int getId();

    /**
     * Gets the {@link PacketBound}
     *
     * @return The {@link PacketBound}
     */
    PacketBound getPacketBound();

    /**
     * Gets the {@link ProtocolState} this packet applies to
     *
     * @return The {@link ProtocolState}
     */
    default ProtocolState getStateApplication() {
        return ProtocolState.PLAY;
    }
}
