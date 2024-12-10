# German Word Analyzer

This Kotlin program is designed to analyze a list of German words and filter them based on user input. The program reads a dictionary file and allows the user to filter words that start with a specific letter at a given position.

## How It Works

1. **Initialization**: The program initializes by loading a dictionary file (`german.dic`) located in the `german` resource folder. The dictionary file is read and stored as a list of strings.

2. **User Interaction**: The program continuously interacts with the user through the command line, prompting for input until the user decides to exit.

3. **Input Handling**:
   - The user is asked to input a single letter (case-sensitive).
   - The user is then asked to input a position (number) where the letter should appear in the words.

4. **Filtering**:
   - If the position is `0`, the program filters words that start with the specified letter.
   - If a specific position is provided, the program filters words where the specified letter appears at the given position.

5. **Output**:
   - The program displays the number of words that match the criteria.
   - The user is then asked if they want to see the list of filtered words.
   - If the user chooses to see the words, they are printed on the screen.

6. **Loop**: The program repeats the process until the user types "exit" to quit.

## Example Usage

1. The program prompts the user to type a letter:
   ```
   Please type a letter (case sensitive) or exit to quit:
   ```
   
2. The user inputs a letter, e.g., `a`.

3. The program then asks for a position:
   ```
   Please type a number (position):
   ```

4. The user inputs a position, e.g., `1`.

5. The program filters the dictionary and displays the number of words that match the criteria:
   ```
   There are X words starting with a at position 1
   ```

6. The user is asked if they want to see the words:
   ```
   Do you want to see the words? (y/n)
   ```

7. If the user inputs `y`, the program prints the list of filtered words.

8. The process repeats until the user types `exit`.

## Dictionary File

The dictionary file (`german.dic`) should be placed in the `resources/german` directory. The file should contain a list of German words, one word per line.

## Running the Program

To run the program, execute the `main` function in the `Main.kt` file using a Kotlin-compatible IDE or command-line tool.

## Notes

- The program expects the dictionary file to be encoded in `ISO_8859_1`.
- The position input by the user is 1-based, meaning `1` refers to the first character of the word. This was to make this program more accessible to researches not familiar with 0-based indexing.
