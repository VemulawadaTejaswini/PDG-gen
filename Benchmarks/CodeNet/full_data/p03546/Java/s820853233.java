import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
    
    int c[][] = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        c[i][j] = Integer.parseInt(sc.next());
      }
    }
    
    int min[] = new int[10];
    for (int i = 0; i < 10; i++) {
      min[i] = c[i][1];
    }
    
    boolean flag = true;
    while (flag) {
      flag = false;
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          int tmp = c[i][j] + min[j];
          if (tmp < min[i]) {
            min[i] = tmp;
            flag = true;
          }
        }
      }
    }
    
    int cost = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int input = Integer.parseInt(sc.next());
        if (input != -1) {
          cost += min[input];
        }
      }
    }
    System.out.println(cost);
  }
}