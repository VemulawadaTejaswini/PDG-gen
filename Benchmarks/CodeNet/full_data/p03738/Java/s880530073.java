import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        if(n1 > n2){
        	System.out.println("GREATER");
        }else if(n1 < n2){
        	System.out.println("LESS");
        }else{
        	System.out.println("EQUAL");
        }
    }
}