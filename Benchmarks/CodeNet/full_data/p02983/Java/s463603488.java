import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long d = sc.nextLong();

		// 0
		// d*(d-1)
		// n*(n+1)
		// 51(d-n)
		long ans=3000;

		if (d-n>2022) {
			System.out.println(0);
		} else {
for(long i=n;i<=d-1;i++){
	for(long k=i+1;k<=d;k++){

		if(ans>((i%2019)*(k%2019))%2019){
			ans=((i%2019)*(k%2019))%2019;

		}
	}
}

System.out.println(ans);
		}
	}
}