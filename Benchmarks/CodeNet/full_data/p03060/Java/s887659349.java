import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] vn = new int[n];
		int[] cn = new int[n];
		int vMax = 0;
		for(int i = 0; i < n; i++) {
			vn[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			cn[i] = sc.nextInt();
			if(vn[i] > cn[i]) {
				vMax += vn[i] - cn[i];
			}
		}
		System.out.println(vMax);
	}

}
