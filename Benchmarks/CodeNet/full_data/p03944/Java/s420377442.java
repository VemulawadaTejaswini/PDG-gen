import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int n = scanner.nextInt();
    
    // 左端のx座標、右端のx座標、下端のy座標、上端のy座標
    int left = 0;
    int right = w;
    int bottom = 0;
    int top = h;
    
    for(int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int a = scanner.nextInt();
      
      switch(a) {
        case 1:
          // 左端より右にある点（left < xなる点）から左を切り捨てる
          // -> 左端を点のx座標で更新する（left = x）
          if(left < x) {
            left = x;
          }
          break;
        case 2:
          // 右端より左にある点（right > xなる点）から右を切り捨てる
          // -> 右端を点のx座標で更新する（right = x）
          if(right > x) {
            right = x;
          }
          break;
        case 3:
          // 下端より上にある点（bottom < yなる点）から下を切り捨てる
          // -> 下端を点のy座標で更新する（bottom = y）
          if(bottom < y) {
            bottom = y;
          }
          break;
        case 4:
          // 上端より下にある点（top > yなる点）から上を切り捨てる
          // -> 上端を点のx座標で更新する（top = y）
          if(top > y) {
            top = y;
          }
          break;
      }
    }
    
    // ありえない場合
    if(left > right || bottom > top) {
      System.out.println(0);
    // 正常に計算できる場合
    } else {
	  System.out.println((right - left) * (top - bottom));
    }
  }
}