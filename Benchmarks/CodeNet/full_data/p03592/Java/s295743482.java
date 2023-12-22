import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if(i*m + j*n - 2*i*j == k){
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}

