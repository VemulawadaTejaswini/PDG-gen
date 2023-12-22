import java.util.*;

public class Main {
  public static boolean check(int num) {
    int i;
    for(i = 1; i * i <= num; i++) {
      if(i * i == num) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int i, j, k, number_n, number_d, temp, count = 0;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    number_d = Integer.parseInt(sc.next());
    int[][] point = new int[number_n][number_d];
    for(i = 0; i < number_n; i++) {
      for(j = 0; j < number_d; j++) {
        point[i][j] = Integer.parseInt(sc.next());
      }
    }
    for(i = 0; i < number_n; i++) {
      for(j = i + 1; j < number_n; j++) {
        temp = 0;
        for(k = 0; k < number_d; k++) {
          temp += (point[i][k] - point[j][k]) * (point[i][k] - point[j][k]);
        }
        if(check(temp)) count++;
      }
    }
    System.out.println(count);
  }
}
