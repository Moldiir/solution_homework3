import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    private List<String> traps = new ArrayList<>();
    private List<String> treasureRooms = new ArrayList<>();

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public IDungeonBuilder addTrap(String trap) {
        traps.add(trap);
        return this;
    }

    public IDungeonBuilder addTreasureRoom(String treasure) {
        treasureRooms.add(treasure);
        return this;
    }

    public Dungeon build() {
        return new Dungeon(name, rooms, npcs, traps, treasureRooms);
    }
}
