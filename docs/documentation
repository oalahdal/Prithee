# Prithee Documentation

## Program Description

Prithee is a console-based game using Shakespeare's Sonnet 18.

The program prints the sonnet until it reaches a randomly selected word. That word is replaced with underscores, and the rest of the sonnet is not printed.

The user is asked to guess the missing word.

If the user guesses correctly, the correct score increases by one. If the user guesses incorrectly, the incorrect score increases by one.

The game continues until the user gets either three correct answers or three incorrect answers.

## Program Design

The program contains two main classes:

### Main

The Main class:
- Starts the program.
- Creates the Scanner used for user input.
- Keeps track of correct and incorrect answers.
- Displays each round.
- Asks the user for their answer.
- Ends the game after three correct or three incorrect answers.

### PritheeGame

The PritheeGame class:
- Stores the sonnet.
- Selects a random word.
- Replaces the selected word with underscores.
- Stops displaying the sonnet after the missing word.
- Stores the correct answer.
- Checks whether the user's guess is correct.

## Pseudocode

Start program

Set correct answers to 0
Set incorrect answers to 0

While correct answers are less than 3 AND incorrect answers are less than 3:

    Select a random word from the sonnet

    Print the sonnet up to that word

    Replace the selected word with underscores

    Ask the user for the missing word

    If the user's answer is correct:
        Print "Correct"
        Increase correct answers by 1

    Otherwise:
        Print "Error"
        Increase incorrect answers by 1

End loop

Print the final result

End program

## Tests

JUnit tests are located in:

src/test/java/PritheeGameTest.java

The tests check:
- A correct answer returns true.
- An incorrect answer returns false.
- Capitalization does not affect the answer.
- Extra spaces around an answer do not affect the answer.
- A generated round contains an answer.

## How to Run the Program

1. Open the project in IntelliJ IDEA.
2. Make sure Java 26 is installed and selected.
3. Open `Main.java`.
4. Click the green Run button next to the `main` method.
5. The game will start in the console.
6. Enter the missing word when prompted.

## How to Run the Tests

1. Open `PritheeGameTest.java`.
2. Click the green Run button next to the test class.
3. JUnit will run all tests.
4. Green checkmarks mean the tests passed.