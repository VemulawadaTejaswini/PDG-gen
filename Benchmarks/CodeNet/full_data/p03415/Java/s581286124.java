import java.util.Scanner;
import java.io.*;

public class Main{
  public Main(){
    Scanner sc = new Scanner(System.in);
    String str1 = "";
    String str2 = "";
    String str3 = "";
    str1 = sc.next();
    str2 = sc.next();
    str3 = sc.next();
    System.out.println(str1);
    System.out.print(str1.charAt(0));
    System.out.print(str1.charAt(1));
    System.out.print(str1.charAt(2));
//    System.out.println(str1.charAt(0)+str1.charAt(1)+str1.charAt(2));
//    hoge();
  }

  public void hoge(){
    System.out.println("hoge");
  }

  public static void main(String args[]){
    Main a = new Main();
//    a.hoge();
  }
}
