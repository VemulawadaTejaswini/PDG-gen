
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int x = 0;
		for(int i=n-1;i>0;i--){
			if(x!=0 && a[i] == a[i-1]){
				System.out.println(x * a[i]);
				break;
			}
			else if(a[i] == a[i-1]){
				x = a[i];
				i--;
			}
			if(i<=1){
				System.out.println(0);
				break;
			}
		}
	}
}