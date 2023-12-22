
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
        int[] x = new int[m];
        int[] y = new int[m];
        int[] num = new int[n];
        Arrays.fill(num, 1);
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, false);
        flag[0] = true;
        for(int i=0;i<m;i++){
        	x[i] = sc.nextInt()-1;
        	y[i] = sc.nextInt()-1;
        }

        for(int i=0;i<m;i++){
        	if(num[x[i]]==1 && flag[x[i]]){
        		num[x[i]]--;
        		flag[y[i]] = true;
        		num[y[i]]++;
        		flag[x[i]] = false;
        	}
        	else if(num[x[i]]>1 && flag[x[i]]){
        		num[x[i]]--;
        		num[y[i]]++;
        		flag[y[i]] = true;
        	}
        	else{
        		num[x[i]]--;
        		num[y[i]]++;
        	}
        }

        int count = 0;
        for(int i=0;i<n;i++){
        	if(flag[i]){
        		count++;
        	}
        }

        System.out.println(count);

    }
}