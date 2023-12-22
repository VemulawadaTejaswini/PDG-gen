import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long ans = 0;
        
        if(m==0){
        	ans =n*n;
        }else{
        
        	for(int i=m+1;i<=n;i++){
        		ans += n/i*(i-m) + Math.max(n%i-(m-1), 0);
//        		System.out.println(n/i*(i-m) +" "+ Math.max(n%i-(m-1), 0));
        	}
        }
        
        System.out.println(ans);


        in.close();
    }
}
