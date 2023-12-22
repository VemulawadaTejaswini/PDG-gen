import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.next(); //元の文字列
    int n = s1.length();
    
    //sが回文であるかをチェック
    StringBuffer sb = new StringBuffer(s1);
    String s2 = sb.reverse().toString(); //反転した文字列
    
    
    //前半が回文かを確かめる
    String str2 = s1.substring(0,(n-1)/2);
    
    StringBuffer sb1 = new StringBuffer(str2);
    String s3 = sb1.reverse().toString();
    
    
    //後半が回文かを確かめる
    String str3 = s1.substring((n+3)/2-1,n);
    
    StringBuffer sb2 = new StringBuffer(str3);
    String s4 = sb2.reverse().toString();
    
    if((s1.equals(s2))&&(str2.equals(s3))&&(str3.equals(s4))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}