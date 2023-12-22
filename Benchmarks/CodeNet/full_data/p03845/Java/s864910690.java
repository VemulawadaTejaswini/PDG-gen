import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for(int i = 0; i < n ; i++){
          time[i] = sc.nextInt();
        }
      
        int m = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < m ; i++){
          ans = 0;
          int tmp = sc.nextInt();
          int drink = sc.nextInt();
          ans += drink;
          for(int j = 0; j < n; j++){
            ans += time[j];
          }
          System.out.println(ans - time[tmp-1]);
        }
      
	}
}
