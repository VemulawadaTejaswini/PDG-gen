import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        long h = sc.nextLong();
      	long w = sc.nextLong();
      	long ans;
      
      	if(h == 1 || w == 1) ans = 0;
      	else if(h*w % 2 == 0) ans = h*w/2;
      	else ans = h*w/2+1;
          
      	System.out.println(ans);      	        
	}
}