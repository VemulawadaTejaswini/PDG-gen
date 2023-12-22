import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] card = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        card[i][j] = sc.nextInt();
      }
    }

    int n = sc.nextInt();
    for (int cnt = 0; cnt < n; cnt++) {
      int num = sc.nextInt();
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (card[i][j] == num) {
            card[i][j] = 0;
          }
        }
      }
    }
    sc.close();
    for(int i = 0; i < 3; i++){
      if(isAllZero(card[i][0], card[i][1], card[i][2]) || isAllZero(card[0][i], card[1][i], card[2][i])){
        System.out.println("Yes");
        return;
      }
    }
    if(isAllZero(card[0][0], card[1][1], card[2][2]) || isAllZero(card[0][2], card[1][1], card[2][0])){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
  static boolean isAllZero(int a, int b, int c){
    if(a != 0 || b != 0 || c != 0){
      return false;
    } else {
      return true;
    }
  }
}