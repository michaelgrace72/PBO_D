public class Jokes {

    private static String joke_string;

    // Function to determine if a joke is funny or not
    // If the length of the joke is < 20, it's funny. Otherwise, it is not funny
    public static void is_funny() {
        if (joke_string.length() < 20) {
            System.out.println("The joke is funny.");
        } else {
            System.out.println("The joke is not funny.");
        }
    }

    // Function to get the first word of the joke, separated by space
    // Many methods can be used here as long as it splits the string by a blank space " "
    public static void first_word() {
        String[] words = joke_string.split(" ");
        if (words.length > 0) {
            System.out.println("First word of the joke: " + words[0]);
        } else {
            System.out.println("No word found in the joke.");
        }
    }
    //To test the program
    //Please don't alter this block of code
    //To make it easier to test your program
    public static void main(String[] args) {
        joke_string = "Knock knock who's there?";
        is_funny();
        first_word();

        joke_string = "Your life";
        is_funny();
        first_word();
    }
}
