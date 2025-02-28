import java.util.*;

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

    @Override
    public String toString() {
        return "Dungeon Name: " + name +
                "\nRooms: " + rooms +
                "\nNPCs: " + npcs +
                "\nTraps: " + traps +
                "\nTreasure Rooms: " + treasureRooms;
    }
}