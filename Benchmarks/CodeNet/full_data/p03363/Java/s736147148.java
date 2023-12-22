import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    int[] sub = new int[N+1];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
      sub[i+1] = num[i] + sub[i];
    }
    
    Arrays.sort(sub);
    long count = 1;
    int now = 0;
    long ans = 0;
    for(int i = 0; i <= N; i++){
      if(i == 0){
        now = sub[i];
      }else{
        if(sub[i] == now && i != N){
          count++;
        }else if(sub[i] == now){
          count++;
          ans += count*(count-1)/2;
        }else{
          ans += count*(count-1)/2;
          count = 1;
          now = sub[i];
        }
      }
    }
    System.out.println(ans);
  }
}