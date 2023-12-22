import java.util.*;

public class Main{
  static int N;
  static boolean[] check;
  static ArrayList<String> list = new ArrayList<>();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = Integer.parseInt(sc.nextLine());
    String P = String.join("", sc.nextLine().split(" "));
    String Q = String.join("", sc.nextLine().split(" "));
    check = new boolean[N];
    func(0,"");
    Collections.sort(list);
    System.out.println(Math.abs(list.indexOf(P)-list.indexOf(Q)));
  }
  public static void func(int M, String str){
    if(str.length() == N){
      list.add(str);
      check[M-1] = true;
      return;
    }
    
    for(int i = 1; i <= N; i++){
      if(check[i-1]){
        continue;
      }
      String U = str + i;
      check[i-1] = true;
      func(i, U);
      check[i-1] = false;
    }
  }
}