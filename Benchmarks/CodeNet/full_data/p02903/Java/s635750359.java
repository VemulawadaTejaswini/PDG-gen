import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        for (int j = 0; j < B; j++) {
          for (int i = 0; i < A; i++) {
            System.out.print(1);
          }
      
          for (int i = 0; i < H - A; i++) {
            System.out.print(0);
          }
          System.out.print("\n");
        }
      
        for (int j = 0; j < H - B; j++) {
          for (int i = 0; i < A; i++) {
            System.out.print(0);
          }
      
          for (int i = 0; i < H - A; i++) {
            System.out.print(1);
          }
          System.out.print("\n");
        }
    }
}