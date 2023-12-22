import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String c1 = String.valueOf(c.charAt(0));
        String c11=String.valueOf(Integer.parseInt(c1)+1);
        
        String c2 = c1 + c1 + c1;
        String c21 = c11 + c11 + c11;
        
        String ans = "";
        if (Integer.parseInt(c2) >= Integer.parseInt(c)) {
        	ans = c2;
        } else {
        	ans = c21;
        }
        
    	System.out.println(ans);   
    
    }
    private static String change19(String str) {
    	if ("1".equals(str)) {
    		str="9";
    	} else if ("9".equals(str)) {
    		str="1";
    	}
    	
    	return str;
    }
}