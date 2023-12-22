import java.util.*;
public class Strings{
    public static void main(String args[]){		
    Scanner scan=new Scanner(System.in);
    System.out.println("Input of two strings of lowercase letters");
    String s1=scan.next();
    String s2=scan.next();
    String s3=s2.concat(s1);
    System.out.println(s3);
  }
}
