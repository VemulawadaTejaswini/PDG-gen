public class Main {
	public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int n = scanner.nextInt();
		    int m = scanner.nextInt();
                    int x = 1900 * m + 100 * (n-m);
                    double p = Math.pow(2, m);
                    int y = (int) p * x;
                    System.out.println(y);
		 } 

}
