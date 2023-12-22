import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = 0;
    
    String s = sc.next();
    for(int i=0; i<(s.length()/2); i++){
      if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        x++;
      }
    }
    System.out.println(x);
  }
}