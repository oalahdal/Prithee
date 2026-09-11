import java.util.List;
import java.util.Random;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class PritheeGame {

    private static final String SONNET = """
            Shall I compare thee to a summer’s day?
            Thou art more lovely and more temperate:
            Rough winds do shake the darling buds of May,
            And summer’s lease hath all too short a date;
            Sometime too hot the eye of heaven shines,
            And often is his gold complexion dimm’d;
            And every fair from fair sometime declines,
            By chance or nature’s changing course untrimm'd;
            But thy eternal summer shall not fade,
            Nor lose possession of that fair thou ow’st;
            Nor shall death brag thou wander’st in his shade,
            When in eternal lines to time thou grow’st:
               So long as men can breathe or eyes can see,
               So long lives this, and this gives life to thee.
            """;

    private static final Pattern WORD_PATTERN =
            Pattern.compile("[\\p{L}]+(?:['’][\\p{L}]+)*");

    private final Random random = new Random();

    private int previousWord = -1;

    public Round createRound() {

        List<MatchResult> words =
                WORD_PATTERN.matcher(SONNET).results().toList();

        int randomWord;

        do {
            randomWord = random.nextInt(words.size());
        } while (randomWord == previousWord);

        previousWord = randomWord;

        MatchResult chosenWord = words.get(randomWord);

        String answer = chosenWord.group();

        String underscores = "_".repeat(answer.length());

        String display =
                SONNET.substring(0, chosenWord.start()) + underscores;

        return new Round(display, answer);
    }

    public boolean isCorrect(String guess, String answer) {

        String cleanedGuess = guess.trim()
                .replace("’", "'");

        String cleanedAnswer = answer.trim()
                .replace("’", "'");

        return cleanedGuess.equalsIgnoreCase(cleanedAnswer);
    }

    public record Round(String display, String answer) {
    }
}