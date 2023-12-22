import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	String s = sc.next();
      	
      	String word1[] =s.split("A");
      	String word2[] =word1[1].split("Z");
      	
      	String count =word2[0];
      	
      	System.out.println(count.length()+2);
 
    }
}