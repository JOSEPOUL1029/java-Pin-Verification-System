import java.util.Scanner;

public class PinVerificationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("\n===PIN VERIFICATION SYSTEM===");
            System.out.print("Enter correct PIN: ");
            int userPin = sc.nextInt();

            if (correctPin == userPin) {
                System.out.println("Access Granted! (Success Verified )");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Access denied . Remain Attemps : "+attempts);
                } else {
                    System.out.println("Maximum Attempts Reached !");
                    System.out.println("---Thanks for using the System!");
                }

            }
        }

    }

}
