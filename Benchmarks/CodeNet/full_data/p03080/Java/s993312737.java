import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    
    int count_r = 0;
    int count_b = 0;
    
    for(int i = 0; i < n; ++i){
      if('R'==s.charAt(i)){
        count_r++;
      }else{
        count_b++;
      }
    }
    
    if(count_r > count_b){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}