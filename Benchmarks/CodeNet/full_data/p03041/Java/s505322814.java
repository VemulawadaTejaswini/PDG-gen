import java.util.*;

public class Main{
	public static void main(String args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int k = scan.nextInt();
      	String s = scan.next();
      	String small = "";
      	if(s.substring(k-1, k).contains("A")){
        	small = "a";
        }
      	else if(s.substring(k-1, k).contains("B")){
        	small = "b";
        }
      	else{
        	small == "c";
        }
      	String ans = s.replace(s.substring(k-1, k), small);
    	Sytem.out.print(ans);
    }
		
}