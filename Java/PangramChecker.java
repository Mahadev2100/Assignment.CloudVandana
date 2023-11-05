import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] isPresent = new boolean[26];

        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }
    
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }
}
