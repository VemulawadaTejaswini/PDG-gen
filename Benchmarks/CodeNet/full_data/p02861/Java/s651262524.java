import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int a = sc.nextInt();
        int x[] = new int[a];
        int y[] = new int[a];
        double xx,yy;
        for(int i = 0;i < a;i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
        }
      
        double ans = 0,tmp = 0;
        for(int i = 0;i < a;i++){
          for(int j = i + 1; j < a;j++){
            xx =  (x[i] - x[j]) * (x[i] - x[j]);
            yy =  (y[i] - y[j]) * (y[i] - y[j]);
            tmp =  xx + yy;
            ans += Math.pow(tmp,0.5) * 2 / a;
          }
        }
      System.out.println(ans);
    }
}