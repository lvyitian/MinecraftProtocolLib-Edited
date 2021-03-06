package com.github.steveice10.mc.protocol.packet.ingame.client.player;

import com.github.steveice10.packetlib.io.NetInput;
import com.github.steveice10.packetlib.io.NetOutput;
import com.github.steveice10.packetlib.packet.Packet;

import java.io.IOException;

public class ClientChangeHeldItemPacket implements Packet {

    private int slot;

    @SuppressWarnings("unused")
    private ClientChangeHeldItemPacket() {
    }

    public ClientChangeHeldItemPacket(int slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return this.slot;
    }

    @Override
    public void read(NetInput in) throws IOException {
        this.slot = in.readShort();
    }

    @Override
    public void write(NetOutput out) throws IOException {
        out.writeShort(this.slot);
    }

    @Override
    public boolean isPriority() {
        return false;
    }

}
