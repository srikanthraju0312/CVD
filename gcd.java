/*
 * This program returns greatest common divisor two given numbers
 */

class common {

	static int gcd(int a, int b)
	{
		// stores minimum(a, b)
		int i;
		if (a < b)
			i = a;
		else
			i = b;


		for (i = i; i > 1; i--) {


			if (a % i == 0 && b % i == 0)
				return i;
		}


		return 1;
	}
	// Driver method
	public static void main(String[] args)
	{
		int a = 30, b = 20;

		// calling gcd() method over
		// the integers 30 and 20
		System.out.println("GCD = " + gcd(b, a));
	}
}
