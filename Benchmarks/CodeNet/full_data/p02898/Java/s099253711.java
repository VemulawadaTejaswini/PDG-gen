import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int sum = 0;
    for(int i = 0; i < n; i++) {
      if(Integer.parseInt(sc.next())>=k)
        sum++;
    }
    System.out.println(sum);
  }
}