import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[3];

    for(int i=0 ; i<3 ; i++){
      c[i]=s.charAt(i);
      if(c[i]=='1'){
        c[i]='9';
      }else if(c[i]=='9'){
        c[i]='1';
      }
    }
    for(int i=0 ; i<3 ; i++){
      System.out.print(c[i]);
    }
    System.out.println();
  }
}
