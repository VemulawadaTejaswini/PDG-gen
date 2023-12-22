import java.util.*;

public class main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long n = sc.nextLong();

      long ans = n*(n-1)/2;

      System.out.println(ans);

    }
}
