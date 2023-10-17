import java.util.*;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input =  sc.next(); 
        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {

        boolean[] letterPresent = new boolean[26];


        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('a' <= c && c <= 'z') {
                letterPresent[c - 'a'] = true;
            }
        }

        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
