import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    char[] cs = S.toCharArray();
    int Q = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < Q; i++){
      String[] T = sc.nextLine().split(" ");
      int op = Integer.parseInt(T[0]);
      if(op == 1){
        int m = Integer.parseInt(T[1]);
        cs[m-1] = T[2].charAt(0);
      }else{
        int m1 = Integer.parseInt(T[1])-1;
        int m2 = Integer.parseInt(T[2])-1;
        Set<Character> set = new HashSet<>();
        for(int j = m1; j <= m2; j++){
          set.add(cs[j]);
        }
        System.out.println(set.size());
      }
    }
  }
}