import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
    for (int i=0;i<n;i++){
      a.put(i+1,1);
    }

    for (int i=2;i<=n;i++){
      ArrayList<Integer> b = factor(i);
      for (int y : b){
        int g = a.get(y);
        a.put(y,g+1);
      }
    }

    long ret = 1;
    long limit = 1000000007;

    for (int j=1;j<=n;j++){
      int gg = a.get(j);
      ret *= (long) gg;
      ret = (long) ret%limit;
    }

    System.out.println(ret);
  }

  static ArrayList<Integer> factor(int n){
    ArrayList<Integer> a = new ArrayList<Integer>();
    while (n > 1){
      for (int i=2;i<=n;i++){
        if (n%i == 0){
          a.add(i);
          n = (int) n/i;
          break;
        }
      }
    }
    return a;
  }

}
