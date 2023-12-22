import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		int y = sc.nextInt();
		int[] a = new int[y];
		int[] b = new int[y-1];
		for(int i = 0; i<y; i++){
			int x = sc.nextInt();
			a[i]=x;
		}
		if(t>=y){
			System.out.println(0);
			return;
		}
		Arrays.sort(a);
		int e = a[y-1]-a[0];
		for(int i = 0; i<y-1; i++){
			b[i]=Math.abs(a[i+1]-a[i]);
		}
		Arrays.sort(b);
		for(int i = 0; i<t-1; i++){
			e-=b[y-2-i];
		}
		System.out.println(e);
	}
}