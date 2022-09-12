package Practice;

public class smaller {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		String smalllarge = (a < b) ? "small " + a : "large " + b;

		System.out.println(smalllarge);

		if (a < b) {

			System.out.println(a + "is smaller value");
		} else {
			System.out.println(b + "is smaller value");
		}
	}

}
