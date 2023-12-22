import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	String s = sc.next();
      	String word[] =s.split("");
      	int i = word.length;
      	int j =0;
      	int A=0;
      	int B=0;
      	int count =0;
      	
      	while(B==0){
      	    i--;
      	    if(word[i].equals("Z")){
      	        B=i;
      	    }
      	   
      	}
      	
      	while(A==0){
      	    
      	    if(word[j].equals("A")){
      	        A=j;
      	    }
      	    j++;
      	}
      	
      	count = B-A;
      	    
      	
      	
      	
      	System.out.println(count);
 
    }
}