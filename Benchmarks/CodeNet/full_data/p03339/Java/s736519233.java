import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int countW =0;int countE =0;
    int[] count = new int[N];
    int min =300000;
    for (int i =0; i<N; i++) {
      for (int j =0; j<N; j++) {
        if (j == i) continue;
        if (j < i && S.charAt(j) == 'W') countW++;
        if (j > i && S.charAt(j) == 'E') countE++;
      }
      min = Math.min(countW + countE,min);
      countW =0;countE =0;
    }
    System.out.println(min);
  }
}    