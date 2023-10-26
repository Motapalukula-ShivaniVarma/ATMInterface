import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ATM atm = new ATM();

            while (true) {
                atm.displayMenu();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.viewTransactionHistory();
                        break;
                        case 2:
   System.out.print("Enter the withdrawal amount: $");
   double withdrawAmount = scanner.nextDouble();
   atm.withdraw(withdrawAmount);
   break;
                }
            }
        }
    }
}


