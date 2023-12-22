import java.util.*;
class Problem{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if((((int)(s.charAt(2)))==((int)(s.charAt(3)))) && (((int)(s.charAt(4)))==((int)(s.charAt(5)))))
    System.out.println("Yes");
    else
    System.out.println("No");
}
}