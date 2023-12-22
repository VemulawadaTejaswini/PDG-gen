import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int l = sc.nextInt();
        int taste[] = new int[n];
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < n; i++){
        	taste[i] = l + i;
            ans += taste[i];
            int a = Math.abs(taste[i]);
            min = Math.min(min, a);
        }
        if(l + n - 1 < 0){
        	System.out.println(ans + min);
        }else{
        	System.out.println(ans - min);
        }
    }
}