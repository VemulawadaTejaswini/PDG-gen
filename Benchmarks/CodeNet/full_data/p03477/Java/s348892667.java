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
			if(i>=10 && i<100)sum+=i/10;
			else if(i>=100 && i<1000) sum+=i/10+i/100;
			else if(i>=1000 && i<10000) sum+=i/10+i/100+i/1000;
			else if(i>=10000 && i<100000)sum+=i/10+i/100+i/1000+i/10000;
			if(sum>=A && sum<=B) SUM+=i;
		}
		System.out.println(SUM);
	}

}
