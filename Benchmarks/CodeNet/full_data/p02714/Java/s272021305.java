import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();
    scan.close();

    int countR = 0;
    int countG = 0;
    int countB = 0;
    for(int i=0; i<N; i++) {
      if(S.charAt(i) == 'R') {
        countR++;
      }
      if(S.charAt(i) == 'G') {
        countG++;
      }
      if(S.charAt(i) == 'B') {
        countB++;
      }
    }

    int countNG = 0;
    for(int i=0; i<N-2; i++) {
      int interval = 1;
      while(i+2*interval < N) {
        if(S.charAt(i) != S.charAt(i+interval) && S.charAt(i) != S.charAt(i+2*interval) && S.charAt(i+interval) != S.charAt(i+2*interval)) {
          countNG++;
        }
        interval++;
      }
    }

    System.out.println(countR * countG * countB - countNG);
  }
}