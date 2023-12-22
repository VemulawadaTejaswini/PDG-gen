import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
      //入力
      int K = sc.nextInt();
      int X = sc.nextInt();
      
      //黒石の可能性がある小さい数字から大きい数字まで
    for(int i = (X-K)+1; i<=(X+K)-1; i++){
      
        System.out.print(i+" ");
     
     }
    }
}