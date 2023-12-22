
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 1;
        if(m%n==0){
        	System.out.println(m/n);
        }
        else{
        	for(int i=2;i<m/n;i++){
        		int x = m - n * i;
        		if(x%i==0){
        			ans = i;
        		}
        	}
        	System.out.println(ans);
        }
    }
}