import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();

    for(int i=0; i<c.length;i++){
      c[i] += n;
      if(c[i]>0x5a){
        c[i] -= 26;
      }
    }

      String ss = new String(c);

      System.out.println(ss);


  }

}