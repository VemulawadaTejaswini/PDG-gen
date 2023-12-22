import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int k =sc.nextInt();
    int st=0;
    while(s.length()>st&&s.charAt(st)=='1'){
      st++;
    }
    if(k-1<st){
      System.out.println(1);
    }else{
      System.out.println(s.charAt(st));
    }
  }
}