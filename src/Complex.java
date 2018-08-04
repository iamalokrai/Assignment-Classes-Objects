//Class having several behavior and properties
public class Complex {
	private float real;
	private float imaginary;

	// method to set
	void set(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	// method to display
	void disp() {
		System.out.println("Real part = " + real + " Imaginary part = " + imaginary);
	}

	Complex sum(Complex first, Complex second) {
		Complex temp = new Complex();
		temp.real = first.real + second.real;
		temp.imaginary = first.imaginary + second.imaginary;
		return temp;

	}

	// toString method to display the values instead of objectId
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}

}
