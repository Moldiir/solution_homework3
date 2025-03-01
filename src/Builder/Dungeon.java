package Builder;

import Prototype.Room;
import Prototype.NPC;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    private List<String> traps;
    private List<String> treasureRooms;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs, List<String> traps, List<String> treasureRooms) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
        this.traps = traps;
        this.treasureRooms = treasureRooms;
    }

    public List<Room> getRooms() { return rooms; }
    public String getName() { return name; }
    public List<NPC> getNpcs() { return npcs; }
    public List<String> getTraps() { return traps; }
    public List<String> getTreasureRooms() { return treasureRooms; }

    @Override
    public String toString() {
        return "Dungeon Name: " + name +
                "\nRooms: " + rooms +
                "\nNPCs: " + npcs +
                "\nTraps: " + traps +
                "\nTreasure Rooms: " + treasureRooms;
    }
}
