#  Rock, Paper, Scissors Game - (Basic Java Projects 1)

## Overview
This project is a simple implementation of the classic game "Rock, Paper, Scissors" using Java. The game allows the player to compete against the computer, which makes random moves. 
The scores are tracked, and the player can choose to play multiple rounds.

## Requirements 
- Basic understanding of Java programming
- JDK (Java Development Kit) installed
- An IDE (Integrated Development Environment) like IntelliJ IDEA, Eclipse, or a simple text editor

## Project Setup

1. #### Clone the Repository
```
git clone <repository_url>
```
2. #### Navigate to the Project Directory

```
cd rock-paper-scissors
```
3. #### Open the Project in Your IDE 

## How to Play 
1. Run the "RockPaperScissors" class.
2. The game will prompt you to enter your move: "rock", "paper", or "scissors".
3. The computer will randomly choose its move.
4. The result of the round will be displayed along with the current scores.
5. You will be asked if you want to play another round. Enter "Yes" to continue or "No" to exit.

## Game Rules
- Rock beats Scissors
- Scissors beat Paper
- Paper beats Rock
- If both the player and the computer choose the same move, the round is a tie.

## Example Play

```
Please enter your move (rock, paper, or scissors): rock
computer played: scissors
You Win!
Scores: You 1 - 0 Computer
Do you want to play again? (Yes/No): yes

```

## Tips and Hints
- Make sure to handle invalid inputs gracefully.
- Use a loop to keep the game running until the player decides to quit.
- Keep track of the scores for both the player and the computer.

## Code Explanation
Here's a brief explanation of the main parts of the code:

 **Move Selection:** The player is prompted to enter their move, and the computer randomly selects a move.

 **Game Logic:** The game logic determines the winner of each round based on the moves.

 **Score Tracking:** Scores are tracked and displayed after each round. 

 **Replay Option:** The player is given the option to play another round or exit.

## License

This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
