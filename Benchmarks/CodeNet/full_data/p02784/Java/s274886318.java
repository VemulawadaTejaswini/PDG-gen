import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		
      	int h = sc.nextInt();
      	int n = sc.nextInt();
      	int dm = 0;
      	String str = "No";
      
      	for(int i = 0;i < n && dm <= h;i++) {
			dm += sc.nextInt();        
        }
      	
      	if(dm <= h) str = "Yes";      	
      	
      	System.out.println(str);
        
	}
}
