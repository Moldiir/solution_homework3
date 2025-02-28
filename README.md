Assignment 1: Implement a Builder for a Complex Object
📌 Overview

This project demonstrates the Builder design pattern for constructing complex objects in Java. The implementation focuses on creating a Dungeon Builder, which allows for the flexible creation of dungeon environments with rooms, NPCs, traps, and treasure rooms.

🏗 Builder Pattern Implementation

The Builder pattern is used to construct a Dungeon step by step.

IDungeonBuilder.java (Interface defining the builder methods)

SimpleDungeonBuilder.java (Concrete implementation of the builder)

Dungeon.java (The final complex object being built)

Key Features

✅ Define a dungeon name
✅ Add multiple rooms and NPCs
✅ Optionally add traps and treasure rooms
✅ Use a build() method to create the final Dungeon object

Example Output
After running MUDBuilderDemo.java, the console output will look like this:

Dungeon Name: Forgotten Abyss
Rooms: [Dragon's Lair, Mystic Grove, Shadow Keep]
NPCs: [Goblin Guard, Ancient Dragon]
Traps: [Spike Pit]
Treasure Rooms: [Golden Chamber]

