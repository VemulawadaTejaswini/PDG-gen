import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int card = sc.nextInt();
		int gate = sc.nextInt();
		int min = 100000;
		int max = 0;

		int[] L = new int[gate];
		int[] R = new int[gate];
		for(int i = 0; i<gate; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
      //max<=1<=minを作り上げる
		for(int i=0; i<gate; i++) {
				max = Math.max(L[i], max);
				min = Math.min(R[i], min);
		}
		int anser = (min-max)+1;
		System.out.println(anser);
	}

}
