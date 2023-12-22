import java.util.*;

class Main {
  public static void main (String[] args) throws java.lang.Exception {
    Scanner scanner = new Scanner(System.in);
    int L = scanner.nextInt();
    double result = ATCoder_abc159_c.largestVolume(L);
    System.out.printf("%f\n", result);
  }
}

class ATCoder_abc159_c {
    // Per Euclidean math, largest possible volume is a cube.
	public static double largestVolume(int L) {
		double lOver3 = (double) L / 3.0;
		double volume = lOver3 * lOver3 * lOver3;
      	return volume;
	}
}
