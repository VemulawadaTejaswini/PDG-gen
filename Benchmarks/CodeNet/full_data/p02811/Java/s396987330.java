import java.util.*;
import java.lang.*;
class main {
	public static void main(String[] args){
   		Scanner scan = new Scanner(System.in);
      	String k1 = scan.next();
      	String x1 = scan.next();
      	
      	int k = this.convert(k1);
      	int x = this.convert(x1);
      	
      	if (500 * x >= k)
          System.out.println("Yes");
      	else
          System.out.println("No");
     
    } 
  
  	public int convert(String s){
    	int res = 0;
   
      	for (char c : s.toCharArray()){
        	res = res * 10 + (c - '0');
        }
    }
}