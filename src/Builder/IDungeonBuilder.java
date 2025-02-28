public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(String trap); // Optional feature
    IDungeonBuilder addTreasureRoom(String treasure); // Optional feature
    Dungeon build();
}
