import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    int count = 0;
    for(int i = 1;i<=n;i++) {
      if(i+k-1<=n) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}
