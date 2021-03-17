import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert in kms ");
        double inKilometres = scanner.nextDouble();
        toMilesPerHour(inKilometres);
        printConversion(inKilometres);
        System.out.println(Math.round(59.496292));

    }
    public static long toMilesPerHour(double kilometresPerHour){
        if (kilometresPerHour < 0){
            return -1;
        }else {
            double toMile = kilometresPerHour / 1.609;
            return Math.round(toMile);
        }
    }
    public static void printConversion(double kilometresPerHour){
        if (kilometresPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            double toMile = kilometresPerHour / 1.609;
            long rounded = Math.round(toMile);
            System.out.println(kilometresPerHour + " km/h = " + rounded + " mi/h");
        }
    }
}
