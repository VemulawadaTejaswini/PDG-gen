import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[] b=sc.next().split(" ");
    char[] a=b[1].toCharArray();
    a[0]=String.valueOf(a).toUpperCase().charAt(0);
    char[] d={a[0]};
    String s=String.valueOf(d);
    System.out.println("A"+s+"C");
  }
}
