import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N*2; i++){
      list.add(Integer.parseInt(S[i]));
    }
    
    Collections.sort(list);
    int ans = 0;
    for(int i = 0; i < N*2; i++){
      if(i%2 == 0){
        ans += list.get(i);
      }
    }
    System.out.println(ans);
  }
}