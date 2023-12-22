import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);


    int N = sc.nextInt();
    Long[] team = new Long[N];
    for (int i = 0; i < N; i++) {
      long sM = 0;
      long fM = 0;
      for(int j = 0; j < 3; j++){
        long currNum = sc.nextLong();
        if (fM < currNum) {
          sM = fM;
          fM = currNum;
        } else if (sM < currNum) {
          sM = currNum;
        }
      }
      team[i] = sM;
    }

    Arrays.sort(team, Collections.reverseOrder());

    long sum = 0;
    for(int i = 0; i < N; i++) {
      sum += team[i];
    }

    System.out.println(sum);
  }
}
