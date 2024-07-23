import java.util.Scanner;

public class NumberComparison {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a number: ");
        int num = scanner.nextInt ();
        System.out.println ("Enter another number: ");
        int num2 = scanner.nextInt ();
        if (num == num2) {
            System.out.println ("These numbers are equal.");
        } else if (num > num2) {
            System.out.println (num + " is greater than " + num2);
        } else {
            System.out.println (num2 + " is greater than " + num);
        }
    }
}
