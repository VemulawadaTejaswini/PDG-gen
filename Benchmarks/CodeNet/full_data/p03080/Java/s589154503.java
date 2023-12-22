import java.util.*;
 
public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    int r = 0;
    int b = 0;
    
    for(int i=0; i<N; i++){
      if(s.charAt(i)=='R'){
        r++;
      }
      if(s.charAt(i)=='B'){
        b++;
      }
    }
    if(r>b){
    System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}