import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    Set<Integer> set = new HashSet<>();
    set.add(n);
    while(true){
      int m = set.size();
      if(n%2 == 0){
        n /= 2;
      }else{
        n = n*3+1;
      }
      set.add(n);
      
      if(set.size() == m){
        break;
      }
    }
    System.out.println(set.size()+1);
  }
}