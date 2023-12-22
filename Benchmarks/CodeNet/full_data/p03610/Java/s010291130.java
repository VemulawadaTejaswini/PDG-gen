import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int slen = s.length();
    if(slen % 2 == 1){
      slen++;
    }
    for(int i = 0;i < slen;i +=2){
      System.out.print(s.substring(i,i+1));
    }
  }
}
