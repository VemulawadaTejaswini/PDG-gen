import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    List<Long> list = new ArrayList<>();
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      list.add(Long.parseLong(T[i]));
    }
    
    for(int i = 0; i < M; i++){
      Collections.sort(list);
      String[] U = sc.nextLine().split(" ");
      int b = Integer.parseInt(U[0]);
      long c = Long.parseLong(U[1]);
      for(int j = 0; j < b; j++){
        if(c > list.get(j)){
          list.set(j, c);
        }else{
          break;
        }
      }
    }
    long ans = 0;
    for(int i = 0; i < N; i++){
      ans += list.get(i);
    }
    System.out.println(ans);
  }
}