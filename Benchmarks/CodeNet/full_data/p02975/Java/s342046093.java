import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long[] num = new long[N];
    Set<Long> set = new HashSet<>();
    
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(sc.next());
      num[i] = n;
      set.add(n);
    }
    
    String ans = "Yes";
    for(int i = 0; i < N-1; i++){
      boolean flag = true;
      for(int j = i+1; j< N; j++){
        long n = num[i]^num[j];
        if(set.contains(n)){
          set.remove(n);
          flag = false;
          break;
        }
      }
      if(flag){
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}