import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Mazlums first commit and push 2");
        System.out.println("Joels second comit and push");

        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("Choose 1");
            option = input.nextInt();
        }while(option != 9);

        System.out.println("Hello there!");
        System.out.println("General Kenobi!");
    }
}
