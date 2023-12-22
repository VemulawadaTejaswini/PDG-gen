import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] a=sc.next().toCharArray();
    a[0]=String.valueOf(a[0]).toUpperCase().charAt(0);
    char[] d={a[0]};
    String s=String.valueOf(d);
    System.out.println("A"+s+"C");
  }
}
