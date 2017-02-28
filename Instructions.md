# A-Pirates-Game-Simulation

Second Assignment In Object Oriented Software Design

Objective: This project option builds upon the work you have done in Homework 2 and 3. It provides a slightly more guided approach to completing the project than the options discussed in class.
Starting Point: Fully working Christopher Columbus solution from Homework 2.
New functionality to be added will include:
• A larger grid.
• A search for treasure with a “Win” notification if CC finds the treasure before being caught by the pirates and/or sea monsters.
• Sea monsters swimming around one (or more) areas of the ocean.
• Improved algorithm for moving the pirate ship. Create multiple strategies for pirate ships to move. Try to make them smarter than the current “chase” strategies.
• Save and resume. Provide a save button and a retrieve button. Click on the save button to save the game using serialization. Click on the retrieve button to open a file picker in order to restore and resume the game.
• Use five design patterns (see below).
• Write JUnit tests for two classes.
Ideas for Extensions (in lieu of final project)
• Movable grid (so that you don’t see all of the terrain at the same time).
• Design mode – in which you design the game (in much the same way as homework 3) by dragging islands etc. Also use other widgets to specify number of islands etc.
• (Optional) Whirlpools which randomly appear. If CC goes down a whirlpool he appears at the exit point. (A bit like snakes and ladders).
• Better polish around the overall game.
• More challenging adventure.
Design Patterns
The requirements specify that you must use five design patterns. Here are some suggestions. I strongly suggest that you use the first four* – and then select a fifth one.
• Singleton*: You can create the map grid as a singleton. Advantage – you can get access to the map grid from any class without having to pass the object around! (Will be covered in class on Tuesday 23rd).
• Factory Method*: Use the factory method to create pirate ships. You could have two types of Pirate ship. They could have different images, different origins etc. Remember the factory
method pattern (as described in class on 2/16) must have an abstract creation method which defers object creation to concrete subclasses. However, the superclass defines other shared methods which act on the created object.
• Strategy*: You could create more than one strategy for how the pirate ships move around the map. Perhaps some of them chase Christopher Columbus (using the observer pattern), while others just patrol the waters in different ways.
• Observer*: This is already in use for the Pirate ships as they observe Christopher Columbus.
• Decorator: You could use the decorator to add special protective powers to Christopher Columbus ship. You could use it to add functionality to the whirlpool.
• Composite: You could quite easily use the composite to create groupings of monsters/sharks. The composite node would define the boundaries in which they could swim. Individual animals are added to a ‘container’. All containers are added to the game (or ocean). You can then stop or start the animals. Whirlpools could be also added as leaf nodes to the ocean. When CC’s ship moves you can find out which container (if any) it is currently in.
