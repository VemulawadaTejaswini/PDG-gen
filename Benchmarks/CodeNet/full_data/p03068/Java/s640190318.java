import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int k = sc.nextInt();
    String p = s.substring(k-1,k);
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < n;i++){
      if(s.substring(i,i+1).equals(p))sb.append(p);
      else sb.append("*");
    }
    System.out.println(sb.toString());
  }
}