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
    String line = "";

    while(line.length() < n){
      for(long i = 0; i < a && line.length() < n; i++){
        line += "1";
      }
      for(long j = 0; j < b  && line.length() < n; j++){
        line += "0";
      }
    }

    line = line.replaceAll("0", "");
    System.out.println(line.length());
  }
}
