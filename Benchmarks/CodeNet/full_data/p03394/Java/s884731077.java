import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> ans = new ArrayList<>();
    if (N == 3) {
      System.out.println("2 3 25");
    } else if (N==4) {
      System.out.println("2 3 5 20");
    } else {
      ans.add(2);
      ans.add(3);
      ans.add(5);
      ans.add(7);
      int sum = 17;
      for (int i=8; i<=30000; i++) {
        if (ans.size() == N-1) {
          // TODO: calculate the last ans
          for (int j=i; j<=30000; j++) {
            if (((j + sum) % 210 == 0) && (gcd(sum, j) != 1)) {
              ans.add(j);
              break;
            }
          }
          break;
        }
        if (i%2==0 || i%3==0 || i%5==0 || i%7==0) {
          ans.add(i);
          sum += i;
        }
      }
      for (int i=0; i<ans.size(); i++) {
        System.out.print(ans.get(i));
        if (i != ans.size()-1) {
          System.out.print(" ");
        }
      }
    }
  }

  static int gcd(int a, int b) {
    if (b==0) {
      return a;
    } else {
      return gcd(b, a%b);
    }
  }
}