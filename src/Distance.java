import java.util.Scanner;

public class Distance {
//Methode zur Berechnung von Kilometer in Meilen
    public static double km2Landmiles(double km) {
        double calculatedMiles = km * 0.6214;
        return calculatedMiles;
    }
    //Methode zur Berechnung von Meilen in Kilometer
    public static double miles2Km (double miles) {
        double calculatedKilometers = miles * 1.60934;
        return calculatedKilometers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine Kilometeranzahl ein!");
        double km = Double.valueOf(scanner.nextLine());
        System.out.println(km + " KM sind " + km2Landmiles(km) + " Landmeilen" );

        System.out.println("Geben Sie eine Meilenanzahl ein!");
        double miles = Double.valueOf(scanner.nextLine());
        System.out.println(miles + " Meilen sind " + miles2Km(miles) + " Kilometer" );

    }
}
