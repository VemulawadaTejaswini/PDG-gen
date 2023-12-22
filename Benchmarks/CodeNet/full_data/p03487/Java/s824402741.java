import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(S[i]));
    }
    
    Collections.sort(list);
    
    int ans = 0;
    int count = 0;
    int now = 0;
    for(int i = 0; i < N; i++){
      int n = list.get(i);
      if(now != n){
        if(now < count){
          ans += count-now;
        }else if(now > count){
          ans += count;
        }
        now = n;
        count = 1;
      }else{
        count++;
      }
      
      if(i == N-1 && now != count){
        ans += count > now ? count-now : count;
      }
    }
    System.out.println(ans);
  }
}