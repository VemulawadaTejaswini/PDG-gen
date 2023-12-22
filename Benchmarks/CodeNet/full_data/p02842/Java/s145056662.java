import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int x = (int)(Math.round(n / 1.08));
        int ans1 = (int)(x * 1.08);
        int ans2 = (int)((x + 1) * 1.08);
        int ans3 = (int)((x - 1) * 1.08);
        if(n == ans1){
        	System.out.println(x);
        }else if(n == ans2){
            System.out.println(x + 1);
        }else if(n == ans3){
            System.out.println(x - 1);
        }else{
        	System.out.println(":(");
        }
    }
} 