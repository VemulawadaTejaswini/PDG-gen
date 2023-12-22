import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();
    
    int all = 0;
    for(int i=0; i<N.length(); i++) {
    	all += n[i]-48;
    }
    int a = Integer.valueOf(N); 
 
    	if(a%all == 0) {
    		System.out.println("Yes");
    	 }else{
    		 System.out.println("No");
      }
    }	 
    }