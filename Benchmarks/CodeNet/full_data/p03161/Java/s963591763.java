import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i<n; i++){
			a[i] = sc.nextInt();
			b[i]=1000000000;
		}
		b[0]=0;
		for(int i = 0; i<n; i++){
			for(int j = 1; j<=s; j++){
				if(i+j<=n-1){
				if(b[i+j]>(Math.abs(a[i]-a[i+j])+b[i])){
					b[i+j]=(Math.abs(a[i]-a[i+j])+b[i]);
				}
				}
			}
		}
		System.out.println(b[n-1]);
	}
}