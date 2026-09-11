import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PritheeGameTest {

    @Test
    void correctAnswerReturnsTrue() {
        PritheeGame game = new PritheeGame();

        boolean result = game.isCorrect("summer", "summer");

        assertTrue(result);
    }

    @Test
    void wrongAnswerReturnsFalse() {
        PritheeGame game = new PritheeGame();

        boolean result = game.isCorrect("winter", "summer");

        assertFalse(result);
    }

    @Test
    void capitalizationDoesNotMatter() {
        PritheeGame game = new PritheeGame();

        boolean result = game.isCorrect("SUMMER", "summer");

        assertTrue(result);
    }

    @Test
    void spacesAroundAnswerDoNotMatter() {
        PritheeGame game = new PritheeGame();

        boolean result = game.isCorrect("   summer   ", "summer");

        assertTrue(result);
    }

    @Test
    void roundHasAnAnswer() {
        PritheeGame game = new PritheeGame();

        PritheeGame.Round round = game.createRound();

        assertNotNull(round.answer());
        assertFalse(round.answer().isEmpty());
    }
}