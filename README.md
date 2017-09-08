# Game-Engine
A self-created Game Engine I use for most of my games. This Game Engine is used primarily for 2D games.
**_NOTE_**: This class is still undergoing updates to its base classes, and additions to the overall engine.

## Sprite Class
This class is responsible for representing any kind of object/ entity in a game. Each Sprite will have its own dimensions, render method, and collision checking methods. Each Sprite will also updates it position depending on its velocity and the time that has elapsed. This class utilizes JavaFX. For instance, each Sprite uses a `GraphicsContext` to draw itself.

## UI Class
This class holds the necessary GUI elements, such as the relevant Panes, to display the UI of a game. Each UI will hold a canvas where the game will actually play out. This class is mostly used for level and instructions display, and for initializing a pair of Sprite statistics (useful for when debugging/ building the game).
