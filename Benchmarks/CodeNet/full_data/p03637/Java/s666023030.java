import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] a = new int[N];

    // 2で割り切れない数値
    int count1 = 0;
    
    // 4で割り切れる数値
    int count2 = 0;

    // 4で割り切れないが2で割り切れる数値
    int count3 = 0;

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      if (a[i] % 2 != 0) {
        count1++;
      } else if (a[i] % 4 == 0) {
        count2++;
      } else {
        count3++;
      }
    }

    sc.close();

    String result = "No";

    if (count3 == 0) {
      if (count1 <= count2 + 1) {
        result = "Yes";
      }      
    } else {
      if (count1 == count2) {
        result = "Yes";
      }
    }

    System.out.println(result);

  }

}