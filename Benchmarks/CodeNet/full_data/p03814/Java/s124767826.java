import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String po=sc.nextLine();
  while(!po.substring(0,1).equals("A"))po=po.substring(1);
  while(!po.substring(po.length()-1,po.length()).equals("Z"))po=po.substring(0,po.length()-1);
System.out.println(po.length());
}
}