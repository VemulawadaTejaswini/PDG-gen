import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int X = sc.nextInt();
            int sum = 0;
            int count = 1;
            for(int i = 0; i < N; i++){
              int j = sc.nextInt();
              sum += j;
              if(sum <= X){
                count++;
              }
            }
            System.out.println(count);
          }
}