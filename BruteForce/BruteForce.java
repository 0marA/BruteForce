package BruteForce;

public class BruteForce {
    public static final String wordToGuess ="rgpwjFUCiu6Pbd";
    public static String word = "";
    public static double startTime = System.nanoTime();
    
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < wordToGuess.length(); i++) {
            bruteForce(wordToGuess.charAt(i));
        }
        System.out.println("Decoded in: " + (System.nanoTime() - startTime) / 1000000000 + " seconds");
    }

    public static void bruteForce(char letter) throws InterruptedException {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(word + c);
            //Thread.sleep(20);
            if (c == letter) {
                word += c;
                System.out.println("Success with " + c);
                return;
            } else if (Character.toUpperCase(c) == letter) {
                word += Character.toUpperCase(c);
                System.out.println("success with " + c);
                return;
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(word + i);
            //Thread.sleep(20);
            if (Integer.toString(i).charAt(0) == letter) { // Ugly type converting :(
                word += i;
                System.out.println("success with " + i);
                return;
            }
        }

        System.out.println("Failure");
        return;
        
    }
}
