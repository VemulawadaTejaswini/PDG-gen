import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double m = sc.nextDouble();
    int buf = 0;
    String ans = "No";

    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      if(a >= 1 / (4 * m)){
        buf += 1;
      }
    }

    if(buf >= m){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
