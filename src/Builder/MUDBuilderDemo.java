package Builder;

import Prototype.NPC;
import Prototype.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Builder.IDungeonBuilder builder = new Builder.SimpleDungeonBuilder();

        Builder.Dungeon epicDungeon = builder.setDungeonName("Forgotten Abyss")
                .addRoom(new Room("Dragon's Lair", "A cavern filled with gold and guarded by a dragon"))
                .addRoom(new Room("Mystic Grove", "A magical forest with glowing plants"))
                .addRoom(new Room("Shadow Keep", "A ruined castle filled with ghosts"))
                .addNPC(new NPC("Goblin Guard", "A small but aggressive creature", 50))
                .addNPC(new NPC("Ancient Dragon", "A legendary fire-breathing beast", 500))
                .addTrap("Spike Pit")
                .addTreasureRoom("Golden Chamber")
                .build();

        System.out.println(epicDungeon);
    }
}
