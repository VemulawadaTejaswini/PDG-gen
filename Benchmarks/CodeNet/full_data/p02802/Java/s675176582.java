
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int AC =0;
    int WA =0;

    int curr =1;
    boolean ignore = false;
    for (int i = 0; i < M; i++) {
      int q = sc.nextInt();
      String res = sc.next();

      if(curr==q && ignore) continue;
      ignore=false;
      if(res.equals("WA")){
        WA++;
      }else{
        AC++;
        ignore=true;
        curr=q;
      }

    }

      System.out.println(AC+" "+WA);

  }
}
