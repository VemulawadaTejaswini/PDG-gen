
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
        int c = sc.nextInt();
        int[] b = new int[m];
        int[][] a = new int[n][m];
        for(int i=0;i<m;i++){
        	b[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		a[i][j] = sc.nextInt();
        	}
        }
        int ans = 0;
        for(int i=0;i<n;i++){
        	int counter = 0;
        	for(int j=0;j<m;j++){
        		counter += a[i][j]*b[j];
        	}
        	counter += c;

        	if(counter>0){
        		ans++;
        	}
        }

        System.out.println(ans);
    }
}