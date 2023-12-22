import java.util.*;


class Main{
public static void main(String[] args) {
  Scanner reader=new Scanner(System.in);
  String a =reader.next();
  if(a.charAt(2)==a.charAt(3)&&a.charAt(4)==a.charAt(5))
  {
    System.out.println("Yes");
    return;
  }
  System.out.println("No");


}
}
