package Builder;

import Prototype.Room;
import Prototype.NPC;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(String trap);
    IDungeonBuilder addTreasureRoom(String treasure);
    Builder.Dungeon build();
}
