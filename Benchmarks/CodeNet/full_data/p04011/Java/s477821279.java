import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int K = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      
      int sum = 0;
      for(int i = 0; i < N; i++){
          if(i < K){
              sum += X;
              
          } else {
              sum += Y;
          }
          
      }
      System.out.println(sum);
    }
}