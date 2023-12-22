import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		long n = sc.nextLong();
		long k = sc.nextLong();
		while(true) {
			long x=n/k;
			long y=n%k;
			if(x==0)
				break;
			else
				n=y;
		}
		long z = Math.abs(n-k);
		if(z<n)
			System.out.println(z);
		else
			System.out.println(n);
	}
}