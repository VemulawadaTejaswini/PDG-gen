import java.util.Scanner;

class hef {
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println(((n)*(n-1))/2 + ((m)*(m-1))/2);
	}
}