import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long a = 0;
    long b = 0;
    
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int x = Integer.parseInt(S[0]);
      int y = Integer.parseInt(S[1]);
      
      int j = 1;
      while(true){
        if(x * j >= a && y * j >= b){
          a = x * j;
          b = y * j;
          break;
        }
        j++;
      }
    }
    
    long ans = a + b;
    System.out.println(ans);
  }
}