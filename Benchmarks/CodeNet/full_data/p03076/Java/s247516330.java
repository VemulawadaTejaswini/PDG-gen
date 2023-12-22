import java.util.*;

class Main {
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] X = new int[5];
		for (int i=0;i<5;i++) {
			X[i]=sc.nextInt();
		}

		int sum=0;
		for (int i=0;i<5;i++) {
			int x;
			if (X[i]%10==0) {
				x=X[i];
			} else {
				x=X[i]/10*10+10;
			}
			sum+=x;
		}

		for (int i=0;i<5;i++) {
			X[i]=X[i]%10;
		}
		Arrays.sort(X);
		int min=0;
		for (int i=0;i<5;i++) {
			if (X[i]!=0) {
				min=X[i];
				break;
			}
		}
		System.out.println(sum-10+min);
	}

}