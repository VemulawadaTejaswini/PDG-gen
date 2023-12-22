import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] list = new int[N];
		for (int index=0; index<N; index++) {
			list[index]=sc.nextInt();
		}
		int now = 0;
		int count= 0;

		for (int index=0; index<N; index++) {
			if (index==0&&list[index]>X) {
				count++;
				break;
			}
			now+=list[index];
			if (now>X) {
				count++;
				break;
			} else if (index+1==N) {
				count+=2;
				break;
			} else {
				count++;
			}

		}

		System.out.println(count);
	}
}
