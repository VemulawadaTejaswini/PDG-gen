import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i <= n / 2; i++){
            int count = 0;
        	for(int j = 1; j < i; j++){
            	if((2 * i + 1) % j == 0){
                	count++;
                }
            }
            if(count == 8){
            	ans++;
            }
        }
        System.out.println(ans);
    }
}