import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    boolean first = true;
    boolean check = false; //true = +, false = -,
    int count = 1;
    int n = Integer.parseInt(sc.next());;
    for(int i = 0; i < N-1; i++){
      int m = Integer.parseInt(sc.next());
      if(first && n != m){
        first = false;
        n = m;
        if(n > m){
          check = true;  
        }else if(n < m){
          check = false;
        }
      }else if(n != m){
        if((check && n > m) || (!check && n < m)){
          n = m;
        }else if((check && n < m) || (!check && n > m)){
          count++;
          first = true;
          n = m;
        }
      }
    }
    System.out.println(count);
  }
}