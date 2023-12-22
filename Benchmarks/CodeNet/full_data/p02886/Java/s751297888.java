import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int d[] = new int[n];
		int ans = 0;
        for(int i = 0; i < n;i++){
			d[i] = sc.nextInt();
        }
      
        for(int i = 0; i < n;i++){
			for(int j = i + 1; j < n;j++){
				ans += d[i] * d[j];
      	    }
        }
      	System.out.println(ans);
 
    }
}