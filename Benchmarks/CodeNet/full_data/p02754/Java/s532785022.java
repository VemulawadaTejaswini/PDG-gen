import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    long n = Long.parseLong(N);
    String A = sc.next();
    long a = Long.parseLong(A);
    String B = sc.next();
    long b = Long.parseLong(B);
    String l = "";

    while(l.length() < n){
      for(long i = 0; i < a && l.length() < n; i++){
        l += "1";
      }
      for(long j = 0; j < b  && l.length() < n; j++){
        l += "0";
      }
    }

    l = l.replaceAll("0", "");
    System.out.println(l.length());
  }
}
