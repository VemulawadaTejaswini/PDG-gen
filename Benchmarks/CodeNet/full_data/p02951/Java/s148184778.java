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
		if(c-(n-m)>=0) {
		System.out.println(c-(n-m));
		}else {
			System.out.println(0);
		}

	}
	public static int sample() {
		return 1;
	}

}
