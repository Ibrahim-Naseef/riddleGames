import java.util.Scanner;

public class Riddles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] riddles = {
                "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
                "The more you take, the more you leave behind. What am I?",
                "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?",
                "I have a face and two hands, but no arms or legs. What am I?",
                "I am always hungry and will die if not fed, but whatever I touch will soon turn red. What am I?",
                "I have a neck but no head, I wear a cap but no hat. What am I?",
                "I am the black child of a white parent, a wingless bird, flying even to the sun's self. What am I?",
                "I am always on the run, but I never move at all. What am I?",
                "I have keys but no locks, space but no room. You can enter, but can't go outside. What am I?",
                "I am the beginning of the end, the end of every place. I am the beginning of eternity, the end of time and space. What am I?",
                "I am always hungry, I must always be fed, the finger I touch, will soon turn red. What am I?",
                "I have a tongue, but cannot speak. I have a bed, but never sleep. What am I?",
                "I am always running, but never move at all. What am I?",
                "I am the beginning of sorrow and the end of sickness. You cannot have me, but you have to give me. What am I?"
        };

        String[] answers = {
                "echo",
                "Footsteps",
                "fire",
                "clock",
                "Fire",
                "bottle",
                "Smoke",
                "river",
                "computer keyboard",
                "e",
                "Fire",
                "shoe",
                "river",
                "Nothing"
        };

        String[] hints = {
                "Hint: This thing is known for its ability to reflect sound.",
                "Hint: Think about what you leave behind when you walk.",
                "Hint: It produces heat and light.",
                "Hint: It has a face with numbers and two hands that move.",
                "Hint: It needs fuel to keep burning.",
                "Hint: It holds liquids.",
                "Hint: It rises from burning materials.",
                "Hint: It flows continuously.",
                "Hint: It's used for typing on a computer.",
                "Hint: Think about the first and last letters of words.",
                "Hint: It needs fuel to keep burning and turns things red.",
                "Hint: It's an article of clothing for your feet.",
                "Hint: It flows continuously.",
                "Hint: Think about the beginning and end of words related to sickness.",
                "Hint: It flows continuously."
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user.
            System.out.println("Riddle: " + selectedRiddle);

            // Get user's answer.
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                // If the answer is incorrect, offer a hint.
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String giveHint = scanner.nextLine().toLowerCase();

                if (giveHint.equals("yes")) {
                    System.out.println(hint);
                }
            }

            // Allow the user to continue or exit.
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score.
        System.out.println("Your final score: " + score);
        System.out.println("thanks for playing!");
    }
}