package src.Prototype;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Creating prototype instances
        Room prototypeRoom = new Room("Dungeon", "A dark and creepy dungeon.");
        NPC prototypeNPC = new NPC("Goblin", "A small, green creature with sharp teeth.", 50);

        // Cloning the prototypes
        Room clonedRoom = prototypeRoom.cloneEntity();
        NPC clonedNPC = prototypeNPC.cloneEntity();


        clonedNPC.setName("Orc");
        clonedNPC.setDescription("A large, strong creature with a club.");
        clonedNPC.setHealth(100);


        clonedRoom.setName("Ancient Hall");
        clonedRoom.setDescription("A mystical hall with glowing symbols.");


        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room (Modified): " + clonedRoom);
        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Cloned NPC (Modified): " + clonedNPC);
    }
}
