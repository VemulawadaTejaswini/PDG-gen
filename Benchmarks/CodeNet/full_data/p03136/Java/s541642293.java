import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int side[] = new int[n];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
        	side[i] = sc.nextInt();
            if(max < side[i]){
            	max = side[i];
            }
            sum += side[i];
        }
        if(sum - max > max){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}