import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		float a = sc.nextInt();
		
    		for(float i = 1; i < 10; i++){
    		    
    		    float b = a/i;
    		    
    		    if(b <= 9.0 && a % i == 0.0) {
    		        System.out.println("Yes");
    		    } else if(i >= 9.0){
    		        System.out.println("No");
    		    } else {
    		        continue;
    		    }
    		}



	}
}