import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int[] B = new int[n];
		int minus = 0;
		boolean flg = true;

		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(a<0){
				a = -a;
				minus++;
			} else if(a==0){
				flg = false;
			}
			B[i] = a;
		}

		if(minus%2==1&&flg){
			int min=0;
			switch(n){
				default:
					if(B[min]>B[1])min=1;
					if(B[min]>B[n-2])min=n-2;
					if(B[min]>B[n-1])min=n-1;
					B[min]=-B[min];
					break;
				case 3:
					if(B[min]>B[1])min=1;
					if(B[min]>B[2])min=2;
					B[min]=-B[min];
					break;
				case 2:
					if(B[0]>B[1]){
						B[1] = -B[1];
					} else {
						B[0] = -B[0];
					}
					break;
			}
		}

		long sum = 0;

		for(int i=0;i<n;i++){
			sum += B[i];
		}

		// 出力
		System.out.println(sum);
	}
}
