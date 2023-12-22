import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] me = s.toCharArray();
    int east = 0;
    for(int i = 0 ; i < n ; ++i){
      if(me[i]=='E') east++;
    }
    //System.out.println(east);
    
    int min = east;
    for(int i = 0 ; i < n-1 ; ++i){
      if(me[i+1]=='E') east--;
      //else west++;
      if(me[i]=='W') east++;
      //else west--;
      //System.out.println(east);
      min = Math.min(min,east);
    }
    

    System.out.println(min);
    
  }
}