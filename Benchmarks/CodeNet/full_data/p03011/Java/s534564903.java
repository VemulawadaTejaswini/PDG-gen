import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
   	int res = 0;
    if (p < q){
      res += p + Math.min(q,r);
    } else {
   		res += q + Math.min(p,r);
    }
    System.out.println(res);
  }
}