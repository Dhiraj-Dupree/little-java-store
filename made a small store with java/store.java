import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our website");
        System.out.println("Make an account to start shopping (c)!");
        String choice = scanner.nextLine();

        if (choice.equals("c")) {
            String username = makeAccount(scanner);
            mainMenu(username, scanner);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }

    public static String makeAccount(Scanner scanner) {
        System.out.println("Creating your new account..");

        System.out.println("Enter a username for your account: ");
        String username = scanner.nextLine();

        if (username.length() < 8 || username.matches("\\d+")) {
            System.out.println("Invalid username, please use at least 8 characters and avoid using only digits.");
            return makeAccount(scanner); // Ask for username again recursively
        }

        System.out.println("Welcome, " + username + "!");

        System.out.println("Time to make a password: ");
        String password = scanner.nextLine();

        if (password.length() < 8 || password.matches("\\d+")) {
            System.out.println("Invalid password, use a stronger one.");
            return makeAccount(scanner); // Ask for password again recursively
        }

        return username;
    }

    public static void mainMenu(String username, Scanner scanner) {
        System.out.println("Now, " + username + ", it's time to start shopping. Here's what we offer - ");
        String[] categories = {"clothing", "shoes", "accessories"};

        for (String category : categories) {
            System.out.println(category);
        }

        System.out.println("Pick a category (clothing, shoes, accessories): ");
        String chosenCategory = scanner.nextLine();

        switch (chosenCategory.toLowerCase()) {
            case "clothing":
                System.out.println("Showing results for " + chosenCategory + ":");
                String[] clothing = {
                        "Mens shirts - $23.99",
                        "Mens pants - $21.99",
                        "Womans shirts - $20.00",
                        "Womans pants - $34.99",
                        "Kids shirts - $8.99",
                        "Kids pants - $9.99"
                };
                for (String item : clothing) {
                    System.out.println(item);
                }
                break;
            case "shoes":
                System.out.println("Showing results for " + chosenCategory + ":");
                String[] shoes = {
                        "Mens shoes - $12.99",
                        "Mens shoes - $23.99",
                        "Womans shoes - $32.99",
                        "Womans shoes - $44.99",
                        "Kids shoes - $32.99",
                        "Kids shoes - $14.99"
                };
                for (String item : shoes) {
                    System.out.println(item);
                }
                break;
            case "accessories":
                System.out.println("Showing results for " + chosenCategory + ":");
                String[] accessories = {
                        "Mens Watches - $69.99",
                        "Mens Watches - $199.99",
                        "Womans bags - $79.99",
                        "Womans bags - $59.99",
                        "Kids hats - $14.99",
                        "Kids hats - $9.99"
                };
                for (String item : accessories) {
                    System.out.println(item);
                }
                break;
            default:
                System.out.println("Invalid category selected.");
                break;
        }
    }
}
