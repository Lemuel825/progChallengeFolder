import java.util.*;

public class Task2DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days,month;
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        while (true) {
            System.out.print("Enter a Month number: ");
            month = scanner.nextInt();

            switch (month) {
                case 1:  // January
                case 3:  // March
                case 5:  // May
                case 7:  // July
                case 8:  // August
                case 10: // October
                case 12: // December
                    days = 31;
                    break;
                case 4:  // April
                case 6:  // June
                case 9:  // September
                case 11: // November
                    days = 30;
                    break;
                case 2:  // February
                    days = 28;
                    break;
                default:
                    System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                    continue;
            }
            break;
        }

        System.out.println("Month: " + monthNames[month - 1]);
        System.out.println("Number of days: " + days);
    }

}

