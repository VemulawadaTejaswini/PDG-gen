import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int a = 0, b = 0, c = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n <= A){
        a++;
      }else if(n <= B){
        b++;
      }else{
        c++;
      }
    }
    System.out.println(Math.min(a, Math.min(b, c)));
  }
}