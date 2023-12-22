import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    //10000 円札 x 枚、5000 円札 y 枚、1000 円札 z 枚
    //10000 * x + 5000 * y + 1000 * z = yと
    //x + y + z = nが成立するように考える
    int x1 = -1;
    int y1 = -1;
    int z1 = -1;
    for(int i = 0; i <= n; i++){
      for (int j = 0; j <= n; j++) {
        for(int k = 0; k <= n; k++){
          if((10000*i + 5000*j + 1000*k) == y){
            if ((i + j + k) == n) {
              x1 = i; y1 = j; z1 = k;
            }
          }
        }
      }
    }
    System.out.println(x1+" "+y1+" "+z1);
  }
}
