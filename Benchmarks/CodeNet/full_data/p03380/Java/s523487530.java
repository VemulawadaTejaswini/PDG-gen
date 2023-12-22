import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    
    int max = 0;
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
      max = max < num[i] ? num[i] : max;
    }
    
    int n = max;
    int m = 0;
    for(int i = 0; i < N; i++){
      int a = Math.abs(max/2 - num[i]);
      if(a < n && num[i] != max){
        n = a;
        m = num[i];
      }
    }
    System.out.println(max+" "+m);
  }
}