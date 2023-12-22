import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int takahashi = 1, aoki = 1;

		for(int i=0; i<n; i++){
			int t = sc.nextInt();
			int a = sc.nextInt();

			int tmp1 = takahashi/t, tmp2 = aoki/a;
			tmp1 += (takahashi%t==0)?0:1;
			tmp2 += (aoki%a==0)?0:1;

			if(a*tmp1>=aoki){
				takahashi = t*tmp1;
				aoki = a*tmp1;
			}else{
				takahashi = t*tmp2;
				aoki = a*tmp2;
			}
		}

		System.out.println((takahashi+aoki));
	}
}