import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int[] countTotal = new int[N];
    int countW =0; int countE =0; int countWa =0; int countEa =0;
    int min =300000;
    for (int i =0; i<N; i++) {
      if (S.charAt(i) == 'W') countW++;
      if (S.charAt(i) == 'E') countE++;
    }
    if (S.charAt(0) == 'W') {
      countTotal[0] = countE ;
    } else {
      countTotal[0] = countE -1;
    }
    min = Math.min(countTotal[0],min);
    
    for (int i =0; i<N-1; i++) {
      if (S.charAt(i) == 'W') countWa++;
      if (S.charAt(i) == 'E') countEa++;
      if (S.charAt(i+1) == 'W') {
        countTotal[i+1] =countWa + countE - countEa;
      } else {
        countTotal[i+1] =countWa + countE - countEa - 1;
      }
      min = Math.min(countTotal[i+1],min);
    }
    System.out.println(min);
  }
}    