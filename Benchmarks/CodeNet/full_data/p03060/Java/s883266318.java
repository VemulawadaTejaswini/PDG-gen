import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		  //入力値取得
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int cost[] = new int[n];
		    int value[] = new int[n];
		    for (int i = 0; i < n; i++)
		      cost[i] = sc.nextInt();
		    for (int i = 0; i < n; i++)
		      value[i] = sc.nextInt();

		    //COST-VALUE 積み上げて最大化させる
		    int ans = 0;
		      for (int i = 0; i < n; i++)
		        if (cost[i] > value[i]) {
		          ans += cost[i] - value[i];
		        }

		    System.out.println(ans);
		    sc.close();
		  }

}