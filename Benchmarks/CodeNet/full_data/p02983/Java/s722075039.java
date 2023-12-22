import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		long r = sc.nextInt();
		long min=2018;
		int flag=0;
		for(long i=0;i<=r;i++) {
		if(	i%2019==0) flag=1;
		}

		for(long i=l;i<r;i++) {
			if(flag==1)break;
			for(long j=i+1;j<=r;j++) {
				if(i*j%2019<min) min=i*j%2019;
				if(min==0) break;
			}
		}

		System.out.println(min);
	}
}