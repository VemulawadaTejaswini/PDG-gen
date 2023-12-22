import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int step = sc.nextInt();
    int posX = 0;
    int posY = 0;

    for (int i = 0; i < step; i++) {

      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      for (int j = 0; j < t; j++) {

        if (posX < x) {
          posX++;
        } else if (posX > x) {
          posX--;
        } else if (posY < y) {
          posY++;
        } else if (posY > y) {
          posY--;
        }

      }

      if (!(posX == x && posY == y)) {
        System.out.println("No");
        return;
      }

    }

    System.out.println("Yes");

  }

}