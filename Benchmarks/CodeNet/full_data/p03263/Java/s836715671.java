
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {


//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int H = cin.nextInt();
    int W = cin.nextInt();

    int[][] map = new int[H][W];
    int[][] used = new int[H][W];

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        map[i][j] = cin.nextInt();
        used[i][j] = 0;
      }
    }

    Queue<String> queue = new LinkedList<>();
    int moveCount = 0;

    for (int i = 0; i < H; i++) {
      int start;
      if (i % 2 == 0) start = 0;
      else start = W - 1;
      for (int j = 0; j < W; j++) {

        if (map[i][j] % 2 == 0 || used[i][j] % 2 == 1) continue;
        else {
          if (i != H - 1) {
            if (i % 2 == 0) {
              if (j != W - 1) {
                if (map[i][j + 1] % 2 == 0 && map[i + 1][j] % 2 == 0) {
                  queue.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j + 2));
                  map[i][j] -= 1;
                  map[i][j + 1] += 1;
                  used[i][j] = 1;
                } else if (map[i][j + 1] % 2 == 1 && map[i + 1][j] % 2 == 0) {
                  queue.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j + 2));
                  map[i][j] -= 1;
                  map[i][j + 1] += 1;
                  used[i][j] = 1;
                } else if (map[i][j + 1] % 2 == 0 && map[i + 1][j] % 2 == 1) {
                  queue.add((i+1) + " " + (j+1) + " " + (i + 2) + " " + (j+1));
                  map[i][j] -= 1;
                  map[i + 1][j] += 1;
                  used[i][j] = 1;
                } else if (map[i][j + 1] % 2 == 1 && map[i + 1][j] % 2 == 1) {
                  queue.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j + 2));
                  map[i][j] -= 1;
                  map[i][j + 1] += 1;
                  used[i][j] = 1;
                }
              } else {
                queue.add((i+1) + " " + (j+1) + " " + (i + 2) + " " + (j+1));
                map[i][j] -= 1;
                map[i + 1][j] += 1;
                used[i][j] = 1;
              }
            } else {
              if (j != W - 1) {
                if (map[i][W - 1 - j - 1] % 2 == 0 && map[i + 1][W - 1 - j] % 2 == 0) {
                  queue.add((i+1) + " " + (W  - j) + " " + (i+1) + " " + (W - 1 - j ));
                  map[i][W - 1 - j] -= 1;
                  map[i][W - 1 - j - 1] += 1;
                  used[i][W - 1 - j] = 1;
                } else if (map[i][W - 1 - j - 1] % 2 == 1 && map[i + 1][W - 1 - j] % 2 == 0) {
                  queue.add((i+1) + " " + (W  - j) + " " + (i+1) + " " + (W - j - 1));
                  map[i][W - 1 - j] -= 1;
                  map[i][W - 1 - j - 1] += 1;
                  used[i][W - 1 - j] = 1;
                } else if (map[i][W - 1 - j - 1] % 2 == 0 && map[i + 1][W - 1 - j] % 2 == 1) {
                  queue.add((i+1) + " " + (W  - j) + " " + (i + 2) + " " + (W  - j));
                  map[i][W - 1 - j] -= 1;
                  map[i + 1][W - 1 - j] += 1;
                  used[i][W - 1 - j] = 1;
                } else if (map[i][W - 1 - j - 1] % 2 == 1 && map[i + 1][W - 1 - j] % 2 == 1) {
                  queue.add((i+1) + " " + (W  - j) + " " + (i+1) + " " + (W - 1 - j ));
                  map[i][W - 1 - j] -= 1;
                  map[i][W - 1 - j - 1] += 1;
                  used[i][W - 1 - j] = 1;
                }
              } else {
                queue.add((i+1) + " " + (j+1) + " " + (i + 2) + " " + (j+1));
                map[i][j] -= 1;
                map[i + 1][j] += 1;
                used[i][j] = 1;
              }
            }
          } else {
            if (i % 2 == 0) {
              if (j != W - 1) {
                queue.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j + 2));
                map[i][j] -= 1;
                map[i][j + 1] += 1;
                used[i][j] = 1;
              }
            } else {
              if (j != W - 1) {
                queue.add((i+1) + " " + (W  - j) + " " + (i+1) + " " + (W - 1 - j ));
                map[i][W - 1 - j] -= 1;
                map[i][W - 1 - j - 1] += 1;
                used[i][W - 1 - j] = 1;

              }

            }

          }
        }

      }
    }

    System.out.println(queue.size());
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

  }


}