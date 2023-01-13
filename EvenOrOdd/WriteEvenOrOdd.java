package EvenOrOdd;

public class WriteEvenOrOdd {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) System.out.println("else if (num == " + i + ") System.out.println(\"Even\");");
            else System.out.println("else if (num == " + i + ") System.out.println(\"Odd\");");
        }
    }
}
