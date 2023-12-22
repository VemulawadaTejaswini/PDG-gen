import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		int n = sc.nextInt(),m = sc.nextInt(),c = sc.nextInt();
		int[] array = new int[n];

		/*for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}*/
		System.out.println(c-(n-m));

	}
	public static int sample() {
		return 1;
	}

}
