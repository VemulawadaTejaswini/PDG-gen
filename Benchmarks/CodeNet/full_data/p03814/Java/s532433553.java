import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	String s = sc.next();
      	
      	String word[] =s.split("");
      	
      	int count=0;
      	String A= "A";
      	
      	
      	for(int i=0;i<word.length;i++){
      	    
      	    if(word[i].equals("A")){
      	        for(int j=i;j<word.length;j++){
      	            
      	            if(word[j].equals("Z")){
      	                count =j;
      	            }
      	            
      	        }
      	        
      	    }
      	    
      	}
      	
      	
      	
      	System.out.println(count);
 
    }
}