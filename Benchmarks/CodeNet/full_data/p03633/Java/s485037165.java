import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long[] sec = new long[N];
    long max = 0;
    for(int i = 0; i < N; i++){
      sec[i] = Long.parseLong(sc.nextLine());
      max = sec[i] > max ? sec[i] : max;
    }
    
    boolean check = true;
    long ans = 0;
    con : for(int i = 1; check; i++){
      long c = max * i;
      for(int j = 0; j < N; j++){
        if(c % sec[j] != 0){
          continue con;
        }
      }
      ans = c;
      break;
    }
    System.out.println(ans);
  }
}