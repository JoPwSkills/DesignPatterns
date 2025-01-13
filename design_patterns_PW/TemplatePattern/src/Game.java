/**
 * Base Templated class for both Football and Crickets
 */

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play(){
        // Initialize the game
        initialize();

        // Start game
        startPlay();

        // end game
        endPlay();
    }
}
