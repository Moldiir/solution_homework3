package Builder;

import Prototype.Room;
import Prototype.NPC;
import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements Builder.IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    private List<String> traps = new ArrayList<>();
    private List<String> treasureRooms = new ArrayList<>();

    public Builder.IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public Builder.IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public Builder.IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public Builder.IDungeonBuilder addTrap(String trap) {
        traps.add(trap);
        return this;
    }

    public Builder.IDungeonBuilder addTreasureRoom(String treasure) {
        treasureRooms.add(treasure);
        return this;
    }

    public Builder.Dungeon build() {
        return new Builder.Dungeon(name, rooms, npcs, traps, treasureRooms);
    }
}
