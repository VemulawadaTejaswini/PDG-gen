import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String a = sc.next();
    int ans =0;
    String w = "#.";
    
    for(int i=0;i<N-1;i++){
      char b = a.charAt(i+1);
      char c = a.charAt(i+2);
      if((b+c)==w){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
