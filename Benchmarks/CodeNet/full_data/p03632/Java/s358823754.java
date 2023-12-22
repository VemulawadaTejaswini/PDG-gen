import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int result = 0; 
    if (c+d < a || a+b < c) {
    	 // なにもなし
     } else if (a<c) {
    	 if (a+b < c+d) {
    		 result=a+b-c;
    	 } else {
    		 result=d;
    	 }
     } else {
    	 if (a+b < c+d) {
    		 result=b;
    	 } else {
    		 result=c+d-a;
    	 }    	 
     }
    System.out.println(result);                
    
    }
}