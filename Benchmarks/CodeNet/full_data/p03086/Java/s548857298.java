import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count =0;
		int max =0;
		
		for(int i= 0; i<S.length(); i++){
		    if(S.charAt(i) == 'A' || S.charAt(i) == 'C'|| S.charAt(i) == 'G' || S.charAt(i) == 'T'){
		        count++;
		        if(max<count){
		            max = count;
		        }
		    }
		    
		    else{
		        count = 0;
		    }
		    
		}
		
		System.out.println(max);
	}
 
}