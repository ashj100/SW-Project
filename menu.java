import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Welcome to the Al-Ula tourist app!");
            System.out.println("1. View events");
            System.out.println("2. Search for an event");
            System.out.println("3. Add an event (manager only)");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Choose the type of event you want to view:");
                    System.out.println("1. Heritage sites");
                    System.out.println("2. Natural wonders");
                    System.out.println("3. Other events");
                    int eventType = scanner.nextInt();
                    
                    // TODO: Display events of the chosen type
                    break;
                case 2:
                    System.out.print("Enter the name of the event you want to search for: ");
                    String eventName = scanner.next();
                    
                    // TODO: Search for the event by name
                    break;
                case 3:
                    // TODO: Add an event (for manager only)
                    break;
                case 4:
                    System.out.println("Thank you for using the Al-Ula tourist app!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }
}