import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();
    int count = 0;
    
    int start = 0;
    if(s - 2*k > 0) start = s - 2*k;
    
    int end = k;
    if(s < k) end = s;
        
    for(int x = start; x <= end; x++){
    	for(int y = start; y <= end; y++){
      		for(int z = start; z <= end; z++){
      		if(x+y+z == s) count++;
    		} 
    	} 
    } 
   	
  	System.out.println(count);

  }
}
