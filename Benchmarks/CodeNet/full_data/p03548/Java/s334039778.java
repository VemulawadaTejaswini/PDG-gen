import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt(); 
            int count = 0;
            for(int i = 0; x > (y+z)*i; i++){
              count++;
            }
            System.out.println(count);
          }
}