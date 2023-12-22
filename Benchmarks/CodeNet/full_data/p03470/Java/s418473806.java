import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int n = Integer.parseInt(sc.next());
      Integer[]d = new Integer[n];
      for(int i = 0; i < n; i++){
        d[i] = Integer.parseInt(sc.next());
      }
      
      Arrays.sort(d, Collections.reverseOrder());
      int cnt = 1; //初期値1
      for(int i = 0; i < n - 1; i++){
        if(d[i] > d[i + 1]){
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}
      