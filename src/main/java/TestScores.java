import java.util.Scanner;

public class TestScores {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter a number between 0 and 100");
    int number = sc.nextInt();

    if (number < 60){
        System.out.println ("Your grade is an F :(");
    } else if (number < 70) {
        System.out.println ("Your grade is a D :(");
    } else if (number < 80) {
        System.out.println ("Your grade is a C :|");
    } else if (number <90) {
        System.out.println ("Your grade is a B :)");
    } else
        System.out.println ("Your grade is a A :)");
}
}
