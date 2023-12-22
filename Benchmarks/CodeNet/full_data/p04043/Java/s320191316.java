import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num[] = new int[3];
    int sev = 0;
    int fiv = 0;

    String ans;
    
    for(int i = 0 ; i < 3 ; ++i){
      num[i] = sc.nextInt();
      if(num[i]==7) sev++;
      else if(num[i]==5) fiv++;
    }
    
    if(sev==1&&fiv==2) ans = "YES";
    else ans = "NO";
    System.out.println(ans);
    
  }
}