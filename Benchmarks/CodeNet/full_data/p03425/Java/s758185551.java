import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    String[] S = new String[N];

    for (int i = 0; i < N; i++) {
      String s_ = sc.next();
      S[i] = s_.substring(0,1);
    }

    sc.close();

    // 0:M 1:A 2:R 3:C 4:H
    long[] arr = new long[5];

    for (int i = 0; i < N; i++) {
      if (S[i].equals("M")) {
        arr[0]++;
      } else if (S[i].equals("A")) {
        arr[1]++;
      } else if (S[i].equals("R")) {
        arr[2]++;
      } else if (S[i].equals("C")) {
        arr[3]++;
      } else if (S[i].equals("H")) {
        arr[4]++;
      }
    }

    long count = 0;

    count += arr[0] * arr[1] * arr[2];
    count += arr[0] * arr[1] * arr[3];
    count += arr[0] * arr[1] * arr[4];
    count += arr[0] * arr[2] * arr[3];
    count += arr[0] * arr[2] * arr[4];
    count += arr[0] * arr[3] * arr[4];
    count += arr[1] * arr[2] * arr[3];
    count += arr[1] * arr[2] * arr[4];
    count += arr[1] * arr[3] * arr[4];
    count += arr[2] * arr[3] * arr[4];

    System.out.println(count);
 
  }

}