import java.util.Scanner;
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    String S = sc.next();
    StringBuffer sb = new StringBuffer(S);
    int ans = 0;
    double num;
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N - i; j++){
        num = Double.parseDouble(sb.substring(i, N-j));
        if(num%P==0) ans++;
      }
    }
    System.out.println(ans);
  }
}