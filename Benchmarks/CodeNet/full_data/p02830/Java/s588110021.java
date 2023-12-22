import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    char[] s = new char[n];
    char[] t = new char[n];
    int i;
    int m;
    char[] b = new char[2*n];
    for(i=0;i<n;i++){
      s[i] = S.charAt(i);
    }
    for(i=0;i<n;i++){
      t[i] = T.charAt(i);
    }
    for(i=0,m=0;i<n;i++,m=m+2){
      b[m] = s[i];
    }
    for(i=0,m=1;i<n;i++,m=m+2){
      b[m] = t[i];
    }
    String str = String.valueOf(b);
    System.out.println(str);
    }
 }

