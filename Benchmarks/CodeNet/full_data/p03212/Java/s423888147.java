import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        sc.close();
        System.out.println(dfs(0,false,false,false));

    }

    static private int dfs(int n, boolean hasThree, boolean hasFive, boolean hasSeven){
      int res = 0;
      if(n > N) return res;

      if(n <= N && n != 0 && hasThree && hasFive && hasSeven) res++;

      if(n >= Math.pow(10, 8)) return res;

      res += dfs(n * 10 + 3, true, hasFive, hasSeven);
      res += dfs(n * 10 + 5, hasThree, true, hasSeven);
      res += dfs(n * 10 + 7, hasThree, hasFive, true);
      return res;
    }
}
