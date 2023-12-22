import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);



      int n = sc.nextInt();

      int[] order = new int[n];


      for(int i = 1; i <= n; i++) {
          int num = sc.nextInt();

          order[num-1] = i;
      }

      String output = "";

      for(int i = 0; i < n; i++) {
          System.out.print(order[i] + " ");

      }


    }
}