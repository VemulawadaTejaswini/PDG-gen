import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0; i<a.length; ++i){
		    a[i] = sc.nextInt();
		}
		int[]b = new int[(n+1)];
		for(int i=0; i<(b.length); ++i){
		    b[i]=a[i];
		}
		b[n]=a[(n-1)];
		for(int i=1; i<b.length; ++i){
		    if(b[i]>a[(i-1)]){
		        b[i]=a[(i-1)];
		    }
		}
		int ans = 0;
		for(int i=1; i<b.length; ++i){
		    ans = ans + b[i];
		}
		System.out.println(ans);
	}
}
