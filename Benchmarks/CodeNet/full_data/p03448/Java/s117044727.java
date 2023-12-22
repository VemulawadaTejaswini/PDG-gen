import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      //500円玉の枚数
      int a = sc.nextInt();
      //100円だまの枚数
      int b = sc.nextInt();
      //50円玉の枚数
      int c = sc.nextInt();
      //合計金額
      int x = sc.nextInt();
      //カウンター
      int counter = 0;
      for(int i = 0; i <= a; i++){
        for(int j = 0; j <= b; j++){
          for(int k = 0; k <= c ;k++){
            int total = 500 * i + 100 * j + 50 * k;
            if(total == x){
            	counter++;
            }
          }
        }
      }
      System.out.print(counter);
    }
}
