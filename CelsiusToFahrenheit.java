import java.util.Scanner;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		double celsius,Fahrenheit;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter celsius");
		celsius=scan. nextDouble();
		
		Fahrenheit=((celsius*9)/5)+32;
		
		System.out.println("Teperature in Fahrenheit is : " + Fahrenheit);
		
	}

}
