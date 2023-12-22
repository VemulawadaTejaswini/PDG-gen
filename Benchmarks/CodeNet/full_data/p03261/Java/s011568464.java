import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      int check =0;
      String[] W = new String[N];
	  for (int i=0; i<N; i++) {
        W[i] = sc.next();
      }
      for (int i=0; i<N-1; i++) {
        if (W[i].charAt(W[i].length()-1) != W[i+1].charAt(0)) {
          check++;
          break;
        }
        for (int j=i+1; j<N; j++) {
          if (W[i].equals(W[j])) {
            check++;
            break;
          }
        }
      }
      if (check != 0) {
        System.out.print("No");
      } else {
        System.out.print("Yes");
      }
    }
}