import java.awt.*;
import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
  String str1,str2;
  Scanner scan=new Scanner(System.in);
  str1=scan.next();
  str2=scan.next();
  String str12=str1.concat(str2);
  System.out.println(str12);
  scan.close();
}
}
