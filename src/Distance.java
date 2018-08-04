//Class having distance in feet inches
public class Distance {
	int feet;
	float inches;

	// Setter method for setting the values
	void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	// Method to display the distance
	void disp() {
		System.out.println("Distance is " + feet + " feet " + inches + " inche");
	}

	// Method of distance type
	Distance add(Distance distance1, Distance distance2) {
		Distance temp = new Distance();
		temp.feet = distance1.feet + distance2.feet;
		temp.inches = distance1.inches + distance2.inches;
		if (distance1.inches + distance2.inches > 12) {
			temp.feet += 1;
			temp.inches -= 12;

		}
		return temp;
	}

}
