import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int w = 0;
    int b = 0;
    for(int i = 0;i < n;i++){
      if(s.charAt(i)=='#')b++;
      else w++;
    }
    System.out.println(Math.min(w,b));
  }
}