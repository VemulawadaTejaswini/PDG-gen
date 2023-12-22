import java.util.*;

public class Main{
	public  static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int k = scan.nextInt();
      	String s = scan.next();
      	System.out.print(s.substring(0, k-1));
      	if(s.substring(k-1, k).contains("A")){
        	System.out.print("a");
        }
      	else if(s.substring(k-1, k).contains("B")){
        	System.out.print("b");
        }
        else if(s.substring(k-1, k).contains("C")){
        	System.out.print("c");
        }
      	System.out.print(s.substring(k, n));
    }
}