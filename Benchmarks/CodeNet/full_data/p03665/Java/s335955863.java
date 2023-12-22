import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P = sc.nextInt();
		int nume = 0;
		int numo = 0;
		long anse = 0;
		long anso = 0;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]%2 == 0)
				nume++;
			else
				numo++;
		}
		
		for (int i = 0; i <= nume;i++) {
			for (int j = 0; j <= numo/2; j++) {
				long a = C(nume,i);
				long b = C(numo,2*j);
				anse = anso + a*b;
			}
		}
		
		for (int i = 0; i <= nume;i++) {
			for (int j = 0; 2*j + 1 <= numo; j++) {
				long a = C(nume,i);
				long b = C(numo,2*j+1);
				anso = anso + a*b;
			}
		}
		
		long total = 1;
		
		for (int i = 1; i <= N; i++)
			total = total*2;
		
		if (P == 0)
			System.out.println(anse);
		else
			System.out.println(anso);
	}
	
	
	public static long C(int N, int k) {
		long ans = 1;
		long Nfac = 1;
		long kfac = 1;
		long Nminuskfac = 1;
		for (int i = 2; i <= N; i++) {
			Nfac = Nfac*i;
		}
		
		for (int i = 2;i <= k; i++) {
			kfac= kfac*i;
		}
		
		for (int i = 2;i <= N-k; i++) {
			Nminuskfac = Nminuskfac*i;
		}
		
		ans = (Nfac)/(kfac*Nminuskfac);
		return ans;
	}
}