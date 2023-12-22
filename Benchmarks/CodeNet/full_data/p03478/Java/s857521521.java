import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum,SUM=0;
		for(int i=1;i<=N;i++) {
			sum=0;
			sum+=i%10;
			if(i>=10) {
				sum+=i/10;
				if(i>=100) {
					sum+=i/100;
					if(i>=1000) {
						sum+=i/1000;
						if(i>=10000) {
							sum+=i/10000;
						}
					}
				}
			}
			if(sum>=A && sum<=B) SUM+=i;
		}
		System.out.println(SUM);
	}

}
