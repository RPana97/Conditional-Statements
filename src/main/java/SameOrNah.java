import java.util.Scanner;

public class SameOrNah {
public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a word: ");
    String word = sc.nextLine();
    System.out.println ("Enter another word: ");
    String word2 = sc.nextLine();

    if (word.toLowerCase().equals(word2.toLowerCase())) {
        System.out.println ("The words are the same.");
    } else {
        System.out.println ("The words are not the same.");
    }
}
}
