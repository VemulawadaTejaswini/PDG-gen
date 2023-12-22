import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    char[] c1=s1.toCharArray();
    String s2=sc.next();
    char[] c2=s2.toCharArray();
    boolean flg=false;
    if(c1[0]==c2[2]){
      if(c1[1]==c2[1]){
        if(c1[2]==c2[0]){
          flg=true;
        }
      }
    }
    if(flg){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}