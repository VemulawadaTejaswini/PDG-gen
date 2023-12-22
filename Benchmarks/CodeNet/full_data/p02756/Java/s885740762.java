import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    List<String> list = new ArrayList<>();
    list.add(S);
    int N = Integer.parseInt(sc.nextLine());
    boolean f = true;
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int order = Integer.parseInt(T[0]);
      if(order == 1){
        f = !f;
      }else{
        int o2 = Integer.parseInt(T[1]);
        if(o2 == 1){
          if(f){
            list.add(0, T[2]);
          }else{
            list.add(T[2]);
          }
        }else{
          if(f){
            list.add(T[2]);
          }else{
            list.add(0,T[2]);
          }
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for(String s : list){
      sb.append(s);
    }
    System.out.println(f ? sb.toString() : sb.reverse().toString());
  }
}
