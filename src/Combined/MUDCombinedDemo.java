package src.Combined;


import Builder.Dungeon;
import Builder.IDungeonBuilder;
import Builder.SimpleDungeonBuilder;
import Prototype.NPC;
import Prototype.Room;
import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Builder.IDungeonBuilder builder = new Builder.SimpleDungeonBuilder();
        Builder.Dungeon baseDungeon = builder.setDungeonName("Ancient Caverns")
                .addRoom(new Prototype.Room("Entrance Hall", "A grand hall."))
                .addRoom(new Prototype.Room("Guardian's Chamber", "A stone chamber."))
                .addNPC(new Prototype.NPC("Stone Guardian", "A massive golem.", 200))
                .addTreasureRoom("Vault of Secrets")
                .build();

        System.out.println("Initial Dungeon:");
        System.out.println(baseDungeon);

        // Клонируем комнату
        Prototype.Room prototypeRoom = new Prototype.Room("Mysterious Room", "A dark and empty space.");
        Prototype.Room clonedRoom1 = prototypeRoom.cloneEntity();
        clonedRoom1.setName("Mysterious Room - Clone #1");

        Prototype.Room clonedRoom2 = prototypeRoom.cloneEntity();
        clonedRoom2.setName("Mysterious Room - Clone #2");

        List<Prototype.Room> updatedRooms = new ArrayList<>(baseDungeon.getRooms());
        updatedRooms.add(clonedRoom1);
        updatedRooms.add(clonedRoom2);

        Builder.Dungeon extendedDungeon = new Builder.Dungeon(
                baseDungeon.getName(),
                updatedRooms,
                baseDungeon.getNpcs(),
                baseDungeon.getTraps(),
                baseDungeon.getTreasureRooms()
        );

        System.out.println("\nExtended Dungeon with Cloned Rooms:");
        System.out.println(extendedDungeon);
    }
}
