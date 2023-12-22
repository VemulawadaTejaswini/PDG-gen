import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int c = 0;
    int d = 0;
    boolean [] a = new boolean[m];
    for (int i=0;i<m;i++){
      int g = scan.nextInt();
      String check = scan.next();
      if (a[g] == true){
        continue;
      }

      if (check.equals("AC") == true){
        c += 1;
        a[g] = true;
      }
      else{
        d += 1;
      }
    }

    System.out.print(c+" ");
    System.out.println(d);
  }
}
