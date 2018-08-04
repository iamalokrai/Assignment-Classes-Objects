import java.util.*;

//Class to implement all the methods of rectangle class 
public class RectangleTest {

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Two instances created
		Rectangle firstrectangle = new Rectangle();
		Rectangle secondrectangle = new Rectangle();

		System.out.println("Enter the length of first rectangle: ");
		// Getting the length for the first rectangle
		int firstlength = scanner.nextInt();

		System.out.println("Enter the breadth of first rectangle: ");
		int firstbreadth = scanner.nextInt();

		System.out.println("Enter the length of second rectangle: ");
		int secondlength = scanner.nextInt();

		System.out.println("Enter the breadth of second rectangle: ");
		int secondbreadth = scanner.nextInt();

		// Setting the length and breadth using setter methods
		firstrectangle.setLength(firstlength);
		firstrectangle.setBreadth(firstbreadth);
		secondrectangle.setLength(secondlength);
		secondrectangle.setBreadth(secondbreadth);

		// Condition to check if the area is equal or not
		if (firstlength != secondlength || firstbreadth != secondbreadth) {
			if (firstrectangle.area() == secondrectangle.area()) {
				System.out.println("The two Rectangles have same area which is " + firstrectangle.area());
			} else {
				System.out.println("The two Rectangles have different area :");
				System.out.println("The area of 1st Rectangle = " + firstrectangle.area());
				System.out.println("The area of 2nd Rectangle = " + secondrectangle.area());
			}
		}
		scanner.close();
	}

}
