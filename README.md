📌 MUD Game: Builder & Prototype Patterns
Overview
This project demonstrates the use of Builder and Prototype design patterns in Java to create a text-based role-playing game (MUD - Multi-User Dungeon). The implementation includes:

Builder for constructing complex objects (dungeons).
Prototype for cloning game objects (rooms and NPCs).
A combination of these two patterns in a single project.
🔄 Assignment 1: Implement a Builder for a Complex Object
Builder Pattern Implementation
The Builder pattern is used to construct the complex object Dungeon step by step.

Project Structure
IDungeonBuilder.java – Interface defining the builder methods.
SimpleDungeonBuilder.java – Concrete implementation of the builder.
Dungeon.java – The final complex object being built.
Key Features
✔️ Set a dungeon name
✔️ Add multiple rooms and NPCs
✔️ Optionally add traps and treasure rooms
✔️ Use the build() method to create the final Dungeon object

Example Output
Dungeon Name: Forgotten Abyss
Rooms: [Dragon's Lair, Mystic Grove, Shadow Keep]
NPCs: [Goblin Guard, Ancient Dragon]
Traps: [Spike Pit]
Treasure Rooms: [Golden Chamber]

🔁 Assignment 2: Implement a Prototype for Cloning Objects
Prototype Pattern Implementation
The Prototype pattern allows cloning existing objects, creating independent copies.

Project Structure
CloneableGameEntity.java – Interface ensuring the ability to clone objects.
Room.java – Room entity, supporting cloning.
NPC.java – NPC entity, supporting cloning.
Key Features
✔️ Clone Room objects
✔️ Clone NPC objects
✔️ Modify clones without affecting the original

Example Output
Original: Mysterious Room - A dark and empty space.
Clone: Mysterious Room - Clone #1 - A dark and empty space.

Original NPC: Ancient Guardian - A stone golem - HP: 200
Clone NPC: Guardian Clone - A stone golem - HP: 200

🔄 Assignment 3: Combine Builder and Prototype
Combining Builder & Prototype Patterns
Goal:

Create a dungeon using the Builder pattern.
Use the Prototype pattern to clone one of the rooms.
Add the cloned rooms to the dungeon.
Project Structure
MUDCombinedDemo.java – Demonstrates the integration of Builder and Prototype patterns.
Example Output
Initial Dungeon:
Dungeon Name: Ancient Caverns
Rooms: [Entrance Hall, Guardian's Chamber]
NPCs: [Stone Guardian]
Treasure Rooms: [Vault of Secrets]

Extended Dungeon with Cloned Rooms:
Dungeon Name: Ancient Caverns
Rooms: [Entrance Hall, Guardian's Chamber, Mysterious Room - Clone #1, Mysterious Room - Clone #2]
NPCs: [Stone Guardian]
Treasure Rooms: [Vault of Secrets]
