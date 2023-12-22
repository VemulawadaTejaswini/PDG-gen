import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    
    int c = 0;
    for(int i = 0; i < N; i++){
      if(s.charAt(i) == 'E'){
        c++;
      }
    }
    
    int d = 0;
    if(s.charAt(0) == 'E'){
      c--;
    }else{
      d++;
    }
    int n = c;
    for(int i = 1; i < N; i++){
      if(s.charAt(i) == 'E'){
        c--;
      }else{
        d++;
      }
      if(c+d < n){
        n = c+d;
      }
    }
    System.out.println(n);
  }
}