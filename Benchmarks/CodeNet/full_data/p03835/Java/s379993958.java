import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int k = sc.nextInt();
    	int s = sc.nextInt();
    	
    	int st = k < s ? k : s;
    		
    	int ans = 0;
    	
    	int a = s%2==0 ? 1: 2;
    
    	
    	for(int i=st; i>0; i--){
    		if(i*3 < s) break;
    		
    		if(i>=s/3){
    			ans += 1;
    		}
    		if(i>s/2){
    			ans += 3*a;
    		}
    		if(i>=s){
    			ans += 3;
    		}
    	}
    	
    	if(s == 2 && k >= 2){
			ans = 6;
		}else if(s == 1 && k >= 1){
			ans = 3;
		}else if(s == 0){
			ans = 0;
		}
    	
    	
    	
    	System.out.println(ans);
    

    }
}
