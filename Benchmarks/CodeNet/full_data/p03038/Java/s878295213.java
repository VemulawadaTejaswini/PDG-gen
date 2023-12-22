import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    List<Long> list1 = new ArrayList<>();
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      list1.add(Long.parseLong(T[i]));
    }
    Collections.sort(list1);
    
    List<Long> list2 = new ArrayList<>();
    for(int i = 0; i < M; i++){
      String[] U = sc.nextLine().split(" ");
      int b = Integer.parseInt(U[0]);
      long c = Long.parseLong(U[1]);
      for(int j = 0; j < b; j++){
        list2.add(c);
      }
    }
    Collections.sort(list2, Collections.reverseOrder());
    
    for(int i = 0; i < N; i++){
      if(list1.get(i) < list2.get(i)){
        list1.set(i, list2.get(i));
      }else{
        break;
      }
    }
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      ans += list1.get(i);
    }
    System.out.println(ans);
  }
}