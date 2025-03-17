package gross_calculator;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();
        scanner.close();
        String message = switch (grade) {
            case "A", "B" -> "great work";
            case "C" -> "just good";
            case "D" -> "not too good";
            case "F" -> {
                String failMessage = "";

                for (int i = 0; i < 100; i++) {
                    failMessage += "OH NO YOU FAILED\n";
                }
                yield failMessage;
            }
            default -> "invalid value mate";
        };
        System.out.println(message);
    }
}
