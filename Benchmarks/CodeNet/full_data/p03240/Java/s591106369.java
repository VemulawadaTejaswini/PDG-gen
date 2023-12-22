
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        int number = 0;
        for(int i=0;i<n;i++){
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        	h[i] = sc.nextInt();
        	if(h[i]!=0){
        		number = i;
        	}
        }
        int X = 0;
        int Y = 0;
        int H = 0;
        for(int i=0;i<=100;i++){
        	for(int j=0;j<=100;j++){
        		int hnew = h[number] + Math.abs(i-x[number]) + Math.abs(j-y[number]);
        		boolean flag = true;
        		for(int k=0;k<n;k++){
        			int hh = Math.max(hnew - Math.abs(i-x[k]) - Math.abs(j-y[k]), 0);
        			if(h[k] != hh){
        				flag = false;
        				break;
        			}
        		}
        		if(flag){
        			X = i;
        			Y = j;
        			H = Math.max(hnew, 0);
        		}
        	}
        }
        System.out.println(X+" "+Y+" "+H);
    }
}