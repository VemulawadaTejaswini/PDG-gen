import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      long a = sc.nextLong();	
	   long b = sc.nextLong();
	   long k = sc.nextLong();      
         if(a>=k){
            System.out.println((a-k)+" "+b);                    
        }else if(b>=k-a){
            System.out.println("0"+" "+(b-(k-a)));               
        }else{
               System.out.println("0 0");    
        }          
	}
}