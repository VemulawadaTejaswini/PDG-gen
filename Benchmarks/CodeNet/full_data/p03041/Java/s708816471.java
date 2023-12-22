import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int k = scan.nextInt();
      	String word = scan.next();
            
      	String ans = word.substring(0,k-1) + word.substring(k-1,k).toLowerCase() + word.substring(k,n);
       System.out.println(ans);
    }
}