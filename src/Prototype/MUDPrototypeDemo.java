package Prototype;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Creating prototype instances
        Prototype.Room prototypeRoom = new Prototype.Room("Dungeon", "A dark and creepy dungeon.");
        Prototype.NPC prototypeNPC = new Prototype.NPC("Goblin", "A small, green creature with sharp teeth.", 50);

        // Cloning the prototypes
        Prototype.Room clonedRoom = prototypeRoom.cloneEntity();
        Prototype.NPC clonedNPC = prototypeNPC.cloneEntity();


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
