package src.Builder;
public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();

        Dungeon epicDungeon = builder.setDungeonName("Forgotten Abyss")
                .addRoom(new Room("Dragon's Lair"))
                .addRoom(new Room("Mystic Grove"))
                .addRoom(new Room("Shadow Keep"))
                .addNPC(new NPC("Goblin Guard"))
                .addNPC(new NPC("Ancient Dragon"))
                .addTrap("Spike Pit")
                .addTreasureRoom("Golden Chamber")
                .build();

        System.out.println(epicDungeon);
    }
}
