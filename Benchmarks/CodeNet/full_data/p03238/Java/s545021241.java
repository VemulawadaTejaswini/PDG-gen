    import java.util.Scanner;
    import java.io.BufferedReader;
    import java.util.*;
     
    public class Main {
        public static void main(String[] args){
     
            Scanner sc = new Scanner(System.in);

            String N = sc.next();
            String A = sc.next();
            String B = sc.next();
            int nValue = Integer.parseInt(N);
            int aValue = Integer.parseInt(A);
            int bValue = Integer.parseInt(B);

            String ans1 = "Hello World";

     
             int n1 = 1;
             
             int ans2 = aValue+bValue;
             

             if ((A == null) || ( B == null)) {
             	A = "0";
             	B = "0";
             }
             
             if( nValue == n1){
            	System.out.println(ans1);
            
            } else{
            	System.out.println(ans2);        	     
            }
        }
      }