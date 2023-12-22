import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int num[] = new int[n];
        String ans = "YES";
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            for(int j = 0; j < i; j++){
            	if(num[i] == num[j]){
                	ans = "NO";
                }
            }
        }
        System.out.println(ans);
    }
}