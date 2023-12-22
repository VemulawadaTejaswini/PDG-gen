import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    StringBuilder sb = new StringBuilder(S);
    int N = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      int order = Integer.parseInt(T[0]);
      if(order == 1){
        sb.reverse();
      }else{
        int o2 = Integer.parseInt(T[1]);
        if(o2 == 1){
          String tem = sb.toString();
          sb = new StringBuilder(T[2]);
          sb.append(tem);
        }else{
          sb.append(T[2]);
        }
      }
    }
    System.out.println(sb.toString());
  }
}
