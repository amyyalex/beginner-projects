import java.util.Scanner;

class TemperatureConverterFunction {
    public static double convertCelsiusToFahrenheit(double temperature) {
        return (temperature * 9.0 / 5.0) + 32;
    }

    public static double convertFahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5.0 / 9.0;
    }
}

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TemperatureConverterFunction converter = new TemperatureConverterFunction();

        while (true) {
            System.out.println("Enter your preferred temperature to convert (F, C) or 'q' to quit: ");
            char choice = scan.next().charAt(0);
            choice = Character.toLowerCase(choice);

            switch (choice) {
                case 'c':
                    System.out.println("Enter the temperature in Celsius to convert: ");
                    double tempInCelsius = scan.nextDouble();
                    double fahrenheitResult = converter.convertCelsiusToFahrenheit(tempInCelsius);
                    System.out.println("Temperature in Fahrenheit: " + fahrenheitResult);
                    break;
                case 'f':
                    System.out.println("Enter the temperature in Fahrenheit to convert: ");
                    double tempInFahrenheit = scan.nextDouble();
                    double celsiusResult = converter.convertFahrenheitToCelsius(tempInFahrenheit);
                    System.out.println("Temperature in Celsius: " + celsiusResult);
                    break;
                case 'q':
                    System.out.println("Goodbye!");
                    scan.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 'F', 'C', or 'q'.");
            }
        }
    }
}
