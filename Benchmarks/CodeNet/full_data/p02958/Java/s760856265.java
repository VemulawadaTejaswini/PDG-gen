import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int count = 0;
    for(int i = 1; i <= N; i++){
      int n = Integer.parseInt(sc.next());
      if(n != i){
        count++;
      }
    }
    String ans = "NO";
    if(count == 0 || count == 2){
      ans = "YES";
    }
    System.out.println(ans);
  }
}