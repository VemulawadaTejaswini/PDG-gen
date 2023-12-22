import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int a, b, i, x;
      a = sc.nextInt();
      b = sc.nextInt();
      x = 0;
      i = 0;
      
      while ( x < b){
        i = i + 1;
        x = a * i;
        if( i > 1){
         x = x - (i - 1) ; 
        }
      }
      System.out.println(i);
    }
}
