import java.util.Scanner;

public class SortCharacter {
    public static void Sort(String str) {
        char[] charArray = str.toCharArray();

        String vowel = "";
        String consonant = "";
        for (char c : charArray) {
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                vowel += c;
            } else {
                consonant += c;
            }
        }

        vowel = vowel.toLowerCase().replaceAll("\\s", "");
        consonant = consonant.toLowerCase().replaceAll("\\s", "");

        System.out.println("Vowel Characters : " + vowel);
        System.out.println("Consonant Characters : " + consonant);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();

        Sort(input);
    }
}
