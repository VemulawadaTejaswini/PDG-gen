import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner cs = new Scanner(System.in);
    int n,k;
    String s;
    n=cs.nextInt();
    k=cs.nextInt();
    s=cs.nextLine();
    char[] c = s.toCharArray();
    c[k-1]+='A'-'a';
    for(int i=0;i<n;i++)System.out.print(c[i]);
    
  }
}