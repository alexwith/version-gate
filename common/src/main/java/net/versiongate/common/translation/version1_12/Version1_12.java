package net.versiongate.common.translation.version1_12;

import java.util.Set;
import net.versiongate.api.gate.gate.IPacketGate;
import net.versiongate.common.gate.gate.ProtocolGate;
import org.eclipse.collections.impl.set.mutable.UnifiedSet;

public class Version1_12 extends ProtocolGate {

    @Override
    public void load() {

    }

    @Override
    public Set<IPacketGate> packetGates() {
        return UnifiedSet.newSetWith();
    }
}
