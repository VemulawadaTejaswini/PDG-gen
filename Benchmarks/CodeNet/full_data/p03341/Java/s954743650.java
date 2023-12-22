import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    String S = sc.next();
    char[] s = S.toCharArray();
    
    int e = 0;
    int w = 0;
    for(int i = 0; i < n ; i++){
      if(s[i] =='E'){
        e++;
      }else{
        w++;
      }
    }
    
    int min = 300000;
    int eChange = e;
    int wChange = 0;
    for(int i = 0; i < n; i++){
      if(s[i] == 'E'){
        eChange--;
      }
      
      if(eChange + wChange <= min){
        min = eChange + wChange;
      }
      
      if(s[i] == 'W'){
        wChange++;
      }
    }
    
    
    System.out.println(min);
    
  }
}