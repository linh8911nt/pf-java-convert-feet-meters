import java.util.Scanner;

public class ConvertFeetMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of table feet to meters: ");
        int size = input.nextInt();
        String[][] tableFeetToMeters = new String[size][2];

        tableFeetToMeters[0][0] = "Feet";
        tableFeetToMeters[0][1] = "Meters";
        int rowTableFeetToMeters = 1;
        do {
            System.out.println("Enter feet: ");
            double feet = input.nextDouble();
            tableFeetToMeters[rowTableFeetToMeters][0] = ("" + feet);
            tableFeetToMeters[rowTableFeetToMeters][1] = ("" + feetToMeters(feet));
            rowTableFeetToMeters++;
        } while (rowTableFeetToMeters < tableFeetToMeters.length);

        System.out.println("Enter size of table feet to meters: ");
        int row = input.nextInt();
        String[][] tableMetersToFeet = new String[row][2];

        tableMetersToFeet[0][0] = "Meters";
        tableMetersToFeet[0][1] = "Feet";
        int rowTableMetersToFeet = 1;
        do {
            System.out.println("Enter meters: ");
            double meters = input.nextDouble();
            tableMetersToFeet[rowTableMetersToFeet][0] = ("" + meters);
            tableMetersToFeet[rowTableMetersToFeet][1] = ("" + metersToFeet(meters));
            rowTableMetersToFeet++;
        } while (rowTableMetersToFeet < tableMetersToFeet.length);

        System.out.println("Table feet to meters: ");
        for (int i = 0; i < tableFeetToMeters.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-8s%s", tableFeetToMeters[i][j], "");
            }
            System.out.println();
        }
        System.out.println("Table meters to feet: ");
        for (int i = 0; i < tableMetersToFeet.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-8s%s", tableMetersToFeet[i][j], "");
            }
            System.out.println();
        }
    }

    public static double feetToMeters(double feet) {
        double meters = 0.305 * feet;
        return meters;
    }

    public static double metersToFeet(double meters) {
        double feet = 3.279 * meters;
        return feet;
    }
}
