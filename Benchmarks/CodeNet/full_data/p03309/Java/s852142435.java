import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int n = sc.nextInt();
		if(n%2 == 0)
			System.out.println(n);
		else
			System.out.println(n*2);
			*/
		//b
		/*
		int n  = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = Math.abs(a[0]-a[a.length-1]);
		System.out.println(ans);
		*/
		//C
		int n = sc.nextInt();
		int[] a = new int[n];
		int b = 0;
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt()-i;
			b+=a[i];
		}
		b = (int)Math.round(b/(double)n);
		int ans = 0;
		for(int j = 0; j< n ; j++){
			ans += Math.abs(a[j]-b);
		}
		System.out.println(ans);
	}
}
