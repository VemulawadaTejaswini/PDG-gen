import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int index1=s.indexOf("A");
    int index2=s.indexOf("Z");
    System.out.println(s.substring(index1,index2));
  }
}