# RiddleGame �puzzle🧩

RiddleGame is a simple Java console application that presents a series of riddles to the user. The user can attempt to solve the riddles, and their score is tracked based on the number of correct answers. If the user gets a riddle wrong, they have the option to receive a hint. 🤔💡

## Getting Started 🚀

To run the RiddleGame application, you'll need to have Java installed on your machine. You can download the latest version of Java from the official website: https://www.java.com/en/download/ ⬇️

Once you have Java installed, follow these steps:

1. Clone the repository or download the source code: 📥
```bash
git clone https://github.com/your-username/RiddleGame.git
   ```
   
2. Navigate to the project directory: 📂
```bash
cd riddleGames
```

3. Compile the Java source code: 👷‍♂️
```bash
javac Riddles.java
```

4. Run the compiled code: ▶️
```bash
java Riddles
```
5. The application will start, and you can begin playing the game by following the prompts in the console. 🎮

## How to Play 🕹️

1. The game will display a riddle. 🤔
2. Enter your answer in the console and press Enter. ✍️
3. If your answer is correct, your score will be incremented. 🎉
4. If your answer is incorrect, you'll be asked if you want a hint. Type "yes" to receive a hint or "no" to skip it. 💡
5. After answering the current riddle, you'll be asked if you want to continue playing. Type "yes" to receive another random riddle or "no" to exit the game. 🔄
6. When you choose to exit, your final score will be displayed. 🏆

## Code Structure 💻

The `RiddleGame` class contains the `main` method, which is the entry point of the application. The class defines arrays for storing riddles, answers, and hints. The game logic is implemented in a loop that continues until the user chooses to exit.

Each iteration of the loop randomly selects a riddle from the arrays and displays it to the user. It then prompts the user for an answer and checks if it matches the correct answer. If the answer is correct, the score is incremented. If the answer is incorrect, the user is offered a hint.

After each riddle, the user is asked if they want to continue playing. If the user chooses to exit, the final score is displayed, and the application terminates.

Feel free to modify the code to add more riddles, change the difficulty level, or enhance the game's functionality as desired. 🛠️

## Output 📸
![output1](https://github.com/Ibrahim-Naseef/riddleGames/assets/156147657/733643c9-0a4e-4f0c-b645-48c562d7cd58)

