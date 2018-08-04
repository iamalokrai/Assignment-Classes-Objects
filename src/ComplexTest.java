import java.util.*;

//Class to implement several methods of yhe complex class
public class ComplexTest {

	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating new object for scanner class to get the input
		Scanner scanner = new Scanner(System.in);
		Complex firstnumber = new Complex();
		Complex secondnumber = new Complex();

		// Taking the Input
		System.out.println("Enter the Real and Imaginary part of the first number : ");
		float firstreal = scanner.nextFloat();
		float firstimaginary = scanner.nextFloat();

		System.out.println("Enter the Real and Imaginary part of the second number : ");
		float secondreal = scanner.nextFloat();
		float secondimaginary = scanner.nextFloat();

		// Setting the value by calling the method
		firstnumber.set(firstreal, firstimaginary);
		secondnumber.set(secondreal, secondimaginary);

		// Creating a new object
		Complex thirdnumber = new Complex();
		thirdnumber = thirdnumber.sum(firstnumber, secondnumber);
		thirdnumber.disp();
		scanner.close();

	}

}
