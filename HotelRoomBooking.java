import java.util.Scanner;

public class HotelRoomBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array representing hotel rooms; 0 = available, 1 = booked
        int[][] rooms = new int[3][4]; // 3 floors with 4 rooms each

        while (true) {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. Display Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                displayRooms(rooms);
            } else if (choice == 2) {
                System.out.print("Enter floor number (0-2): ");
                int floor = sc.nextInt();
                System.out.print("Enter room number (0-3): ");
                int room = sc.nextInt();

                if (floor < 0 || floor > 2 || room < 0 || room > 3) {
                    System.out.println("Invalid floor or room number!");
                } else if (rooms[floor][room] == 1) {
                    System.out.println("Room already booked.");
                } else {
                    rooms[floor][room] = 1;
                    System.out.println("Room booked successfully!");
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the booking system.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Display the room availability
    static void displayRooms(int[][] rooms) {
        System.out.println("\nRoom Availability (0 = Available, 1 = Booked):");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print("Floor " + i + ": ");
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }
}
