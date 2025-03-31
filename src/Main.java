import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String userInput = scanner.nextLine();
        boolean result = dfaLogic.checkString(userInput.toCharArray());
        System.out.println("String: " + userInput + " | Result: " + (result ? "True" : "False"));
        scanner.close();
    }
}