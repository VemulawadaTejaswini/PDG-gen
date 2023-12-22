import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int numFriends = sc.nextInt();

      int cent = sc.nextInt();

      int yes = 0;

      for(int i = 0; i < numFriends; i++) {
          int height = sc.nextInt();
          if (height >= cent) {
            yes++;
          }
      }

      System.out.print(yes);


    }
}