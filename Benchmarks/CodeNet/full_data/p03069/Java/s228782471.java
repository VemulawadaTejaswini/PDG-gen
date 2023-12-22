import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int w = 0;
    int b = 0;
    int k = 1;
    int l = 1;
    int min = 0;
    if(s.charAt(0)=='.')
      while(k<=n-2&&s.charAt(k)==s.charAt(k+1))k++;
    if(s.charAt(n-1)=='#')
      while(l<=n-1&&s.charAt(n-l)==s.charAt(n-l-1))l++;
    for(int i = 0;i < n;i++){
      if(s.charAt(i)=='#')b++;
      else w++;
    }
    if(s.charAt(0)=='.'&&s.charAt(n-1)=='#')min = Math.min(b-l,w-k);
    else if(s.charAt(0)=='.')min = Math.min(w-k,b);
    else if(s.charAt(n-1)=='#')min = Math.min(w,b-l);
    else min = Math.min(w,b);
    System.out.println(min);
  }
}
