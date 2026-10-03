import java.util.Scanner;

public class Hackathon2c {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double total = morningEnergy + eveningEnergy;
        return total;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double morningEnergy = scanner.nextDouble();

        System.out.print("Enter evening energy: ");
        double eveningEnergy = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}