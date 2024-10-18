import java.util.*;
public class latihan3 {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    double fahrenheit;
    double celcius;
    fahrenheit = getFahrenheit();
    celcius = calculateCelcius(fahrenheit);
    displayResult(fahrenheit, celcius);
  }

  private static double getFahrenheit() {
    double fahrenheit;
    System.out.println("Enter fahrenheit temperature:");
    fahrenheit = input.nextDouble();
    return fahrenheit;
  }
  private static double calculateCelcius(double fahrenheit) {
    double celcius;
    celcius = (fahrenheit - 32) * 5 / 9;
    return celcius;
  }
  private static void displayResult(double fahrenheit, double celcius) {
    System.out.println(fahrenheit + " Fahrenheit is " +
    celcius + " celcius");
  }
}