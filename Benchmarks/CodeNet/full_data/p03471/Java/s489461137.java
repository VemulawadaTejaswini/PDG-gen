import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  //袋の中のお札の枚数
      int n = sc.nextInt();
      //合計
      int y = sc.nextInt();
      int total = 0;
      int c = 0;
      for(int i = 0; i <= n; i++){
        for(int j = 0; j <= n; j++){
          for(int k = 0; k <= n; k++){
            total = 10000 * i + 5000 * j + 1000 * k;
            if(c > 0){
              break;
            }
            if(total == y){
              System.out.println(i + " " + j + " " + k);
              c++;
              break;
            }
          }
          if(c > 0){
          	break;
          }
          if(c > 0){
            break;
          }
        }
      }
      if(c == 0){
      	System.out.print(-1 + " " + -1 + " " + -1);
      }
    }
}