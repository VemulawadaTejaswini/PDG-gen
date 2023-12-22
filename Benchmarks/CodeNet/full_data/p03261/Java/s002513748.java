import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String[] W = new String[N];

    for (int i = 0; i < N; i++) {
      W[i] = sc.next();
    }

    sc.close();

    String result = "Yes";

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (W[i].equals(W[j])) {
          result = "No";
          break;
        }
      }
      if (result == "No") {
        break;
      }
    }

    String start = "";

    if (result == "Yes") {
      for (int i = 0; i < N; i++) {
        if (i != 0) {
          String[] s_ = W[i].split("");
          if (s_[0].equals(start)) {
            start = s_[s_.length - 1];
          } else {
            result = "No";
            break;
          }
        } else {
          String[] s_ = W[i].split("");
          start = s_[s_.length - 1];
        }
      } 
    }

    System.out.println(result);

  }

}