import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for(int i = n;i >= 1;i--) {
      sum += (n-i+1) % n;
    }

    System.out.println(sum);


  }

}
