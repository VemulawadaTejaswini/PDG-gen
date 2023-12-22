import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int H = 100;
    int W = 100;
    char[][] field = new char[H + 10][W + 10];

    for (int i = 0; i < H / 2; i++){
      for (int j = 0; j < W; j++){
        field[i][j] = '.';
      }
    }
    for (int i = H / 2; i < H; i++){
      for (int j = 0; j < W; j++){
        field[i][j] = '#';
      }
    }
    for (int i = 0; i < A - 1; i++){
      field[2 * i / 50][2 * i % 50] = '.';
    }
    for (int i = 0; i < B - 1; i++){
      field[2 * i / 50 + 2 / H + 1][2 * i % 50] = '.';
    }
    System.out.println(100 + " " + 100);
    for (int i = 0; i < H; i++){
      for (int j = 0; j < W; j++){
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
  }
}
