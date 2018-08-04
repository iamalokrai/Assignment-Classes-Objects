//Time class created
public class Time {
	private int hours;
	private int minutes;

	// Setter method to set the time
	void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	// Method to display time
	void showTime() {
		System.out.println("New time is " + hours + " hours " + minutes + " minutes");
	}

	// Method to add the two times
	Time sum(Time time1, Time time2) {
		Time temp = new Time();
		temp.hours = time1.hours + time2.hours;
		temp.minutes = time1.minutes + time2.minutes;
		if (temp.minutes >= 60) {
			temp.hours += 1;
			temp.minutes -= 60;
		}
		return temp;
	}

}
