import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int[][] c = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++){
        c[i][j] = sc.nextInt();
      }
    }

    sc.close();

    String result = "Yes";

    int d1 = c[0][0] - c[0][1];
    int d2 = c[1][0] - c[1][1];
    int d3 = c[2][0] - c[2][1];
    int d4 = c[0][1] - c[0][2];
    int d5 = c[1][1] - c[1][2];
    int d6 = c[2][1] - c[2][2];

    if (d1 != d2 || d2 != d3) {
      result = "No";
    }

    if (d4 != d5 || d5 != d6) {
      result = "No";
    }

    System.out.println(result);

  }

}