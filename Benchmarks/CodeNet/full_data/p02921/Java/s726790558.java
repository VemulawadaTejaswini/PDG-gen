import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String s[] =S.split("",0);
    String T =sc.next();
    String t[] =T.split("",0);
    int ans=0;
    for(int i=0;i<3;i++){
      if(s[i].equals(t[i])){ans =ans+1;}}
    System.out.println(ans);
  }
}