import java.util.*;
import java.lang.Integer;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int r = sc.nextInt();
      int D = sc.nextInt();
      int x2000 = sc.nextInt();
      
      int preX = x2000;
      int nextX = 0;
      
      for(int i = 0; i < 10; i++){
        nextX = r * preX - D;
        System.out.println(nextX);
        preX = nextX;
      }
    }
}