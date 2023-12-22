import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i=0; i<m; i++){
			a[i] = sc.nextInt();
		}
		int ans = n;
		for(int i: a){
			ans -= i;
		}
		if(ans > -1){
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

	}
}
