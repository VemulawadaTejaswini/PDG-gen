import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = N / 2;
            if(N % 2 == 0){
              System.out.println((double) 1 / N);
            } else {
              System.out.println((double) (N / 2 + 1) / N);
            }
        }
}