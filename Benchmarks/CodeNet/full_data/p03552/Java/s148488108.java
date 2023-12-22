
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int score;
		if(n == 1){ System.out.println(Math.abs(a[n-1] - w));
			return;
		}
		if(Math.abs(a[n-1] - w) > Math.abs(a[n-2] - a[n-1])){
			System.out.println(Math.abs(a[n-1] - w));
		}else{
			System.out.println(Math.abs(a[n-2] - a[n-1]));
		}
	}
}
