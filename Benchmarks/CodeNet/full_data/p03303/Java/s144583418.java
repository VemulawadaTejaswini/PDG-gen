import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int w=sc.nextInt();
    String ans="";
    for(int i=0;i<s.length();i+=w){
      ans+=s.substring(i,i+1);
    }
    System.out.println(ans);
  }
}
