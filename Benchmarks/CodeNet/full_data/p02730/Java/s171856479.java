import java.util.*;
import java.io.*;

public class Main{
  public static boolean kaibun(String s){
  StringBuffer sb=new StringBuffer(s);
  sb.reverse();
  String t=sb.toString();
  return t.equals(s);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    int n=s.length();
    char[] a;
    a=s.toCharArray();
    String x="",y="";
    for(int i=0;i<(n-1)/2;i++){
      x+=a[i];
      y+=a[(n+1)/2+i];
    }
    if(kaibun(s)&&kaibun(x)&&kaibun(y)){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
    
  }
}