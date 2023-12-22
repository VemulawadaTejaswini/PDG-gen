import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    String S = sc.next();
    char[] s = S.toCharArray();
    
    int count = 0;
    int min = 300000;
    for(int i = 0; i < n ; i++){
      for(int j = 0; j < n; j++){
        if(i != j && i < j){
          if(s[j] == 'E'){
            count++;
          }
        }else if(i != j && i > j){
          if(s[j] == 'W'){
            count++;
          }
        }
      }
      
       //System.out.print(count);
       min = Math.min(min,count);
       count = 0;
      
    }
      
    System.out.println(min);
    
  }
}