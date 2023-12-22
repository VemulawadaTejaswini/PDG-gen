import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P = sc.nextInt();
		int nume = 0;
		int numo = 0;
		BigInteger anse = new BigInteger("0");
		BigInteger anso = new BigInteger("0");
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]%2 == 0)
				nume++;
			else
				numo++;
		}
		
		int i;
		long even = 1;
		
		for (i = 1; i <= nume; i++)
			even *= 2;
		
		for (i = 0; 2*i <= numo; i++)
			anse = anse.add(C(numo,2*i));
		
		for (i = 0; 2*i + 1<= numo; i++)
			anso = anso.add(C(numo,2*i+1));
		BigInteger numeven = new BigInteger(""+even);
		anse = anse.multiply(numeven);
		anso = anso.multiply(numeven);
		
		if (P == 0)
			System.out.println(anse);
		else
			System.out.println(anso);

	}
	
	
	public static BigInteger C(int N, int k) {
		BigInteger ans = new BigInteger("1");
		BigInteger Nfac = new BigInteger("1");
		BigInteger kfac = new BigInteger("1");
		BigInteger Nminuskfac = new BigInteger("1");
		for (int i = 2; i <= N; i++) {
			BigInteger a = new BigInteger(""+i);
			Nfac = Nfac.multiply(a);
		}
		
		for (int i = 2;i <= k; i++) {
			BigInteger a = new BigInteger(""+i);
			kfac = kfac.multiply(a);
		}
		
		for (int i = 2;i <= N-k; i++) {
			BigInteger a = new BigInteger(""+i);
			Nminuskfac = Nminuskfac.multiply(a);
		}
		BigInteger deno = kfac.multiply(Nminuskfac);
		ans = Nfac.divide(deno);
		return ans;
	}
}