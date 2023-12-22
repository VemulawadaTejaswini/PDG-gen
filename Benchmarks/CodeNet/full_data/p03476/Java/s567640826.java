import java.util.Scanner;

public class Main {

	boolean isprime[] = new boolean[100001];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main main =new Main();
		main.sieve();
		int primeCount[]=new int[100001];
		int count =0;
		for(int i=0;i<=100000;i++) {
			if(main.isprime[i]==true&&main.isprime[(i+1)/2]==true) {
				count ++;
			}
			primeCount[i] =count;
		}
		int Q= sc.nextInt();
		for (int i=0;i<Q;i++) {
			int l= sc.nextInt();
			int r =sc.nextInt();
			if (l==r) {
				if (main.isprime[i]==true&&main.isprime[(i+1)/2]==true) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(primeCount[r]-primeCount[l]);
			}
		}
	}

	public void  sieve() {
		for (int i=0;i<=100000;i++) {
			isprime[i]=true;
		}
		isprime[0] =false;
		isprime[1] =false;
		for (int i=2;i<=100000;i++) {
			if (isprime[i]==true) {
				for(int j=2*i;j<=100000;j+=i) {
					isprime[j] =false;
				}
			}
		}
	}
}