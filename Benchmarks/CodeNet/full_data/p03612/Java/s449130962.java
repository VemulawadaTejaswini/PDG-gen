import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ans = 0;
    int count = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n == i+1){
        count++;
      }else if(count > 1){
        ans += count-1;
        count= 0;
      }else{
        ans+=count;
        count= 0;
      }
    }
    if(count > 1){
      ans+=count-1;
    }else{
      ans+=count;
    }
    System.out.println(ans);
  }
}