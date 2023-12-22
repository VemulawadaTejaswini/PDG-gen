import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String N =sc.next();
    int n =N.length();
    String M[]=N.split("",0);
    int m =Integer.parseInt(M[0]);
    long ans =m-1+(n-1)*9;
    System.out.println(ans);
  }
}