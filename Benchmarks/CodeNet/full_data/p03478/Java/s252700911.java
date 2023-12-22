import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int modsum=0;
		int sum=0;
		for(int a=1;a<=N;a++) {
			modsum = modsum(a);
			if(A<=modsum&&modsum<=B) {
				sum += a;
			}
		}
		System.out.println(sum);
	}
	public static int modsum(int n){
		int modsum = 0;
		while(n!=0) {
		    modsum += n % 10;
		    n /= 10;
		}
	 return modsum;
	}
}