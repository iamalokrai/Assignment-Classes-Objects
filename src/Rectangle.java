//Creating a rectangle class having method to find the area
public class Rectangle {
	private int length;
	private int breadth;

	// Constructor with parameter
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Constructor to initialize the value of length and breadth as 1
	public Rectangle() {
		this(1, 1);
	}

	// getter method
	public int getLength() {
		return length;
	}

	// setter method
	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	// method to get the area
	public int area() {
		return (length * breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

}
