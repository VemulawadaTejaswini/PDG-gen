
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count0 = 0;
        int count1 = 0;
        for(int i=0;i<n;i++){
        	if(s.charAt(i)=='0'){
        		count0++;
        	}
        	else{
        		count1++;
        	}
        }
        System.out.println(2*(int)Math.min(count0, count1));
    }
}