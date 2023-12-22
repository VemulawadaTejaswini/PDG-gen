import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int  N = sc.nextInt();
		int L = sc.nextInt();

		boolean flag = true;
		int[] list = new int [N];

		for (int index=0; index<N; index++) {
			int temp = index+L;
			if (temp==0) {
				flag = false;
			}
			list[index]=temp;
		}

		if (flag) {
			if (list[0]>0) {
				list[0]=0;
			} else {
				list[N-1]=0;
			}
		}

		int sum = 0;
		for (int index=0; index<N; index++) {
			sum+=list[index];
		}

		System.out.println(sum);
	}
}