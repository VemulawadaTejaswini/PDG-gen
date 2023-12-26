public class Main {
    public static double result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
        if ((x % 2) == 0) {
          result = ((x / 2) / x);
        } else {
          if (x == 1) {
            result = 1;
          } else {
            result = ((((x -1)/2) + 1) / x);
          }
        }
		System.out.println(String.format("%.10f", result));
	} 
}
