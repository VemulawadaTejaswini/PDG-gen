import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int count = 0;
            for(int i = 1; i < 10; i++){
              for(int j = 1; i < 10; j++){
                if(x % (i*j)==0){
                  count++;
                }
              }
            }
            if(count >= 1){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
          }
}