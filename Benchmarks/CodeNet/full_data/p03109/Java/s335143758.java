import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int a=Integer.parseInt(s.substring(5,7));
    // System.out.println(a);
    // int b=Integer.parseInt(s.substring(8));
    // System.out.println(b);

    if(a<=4){
      System.out.println("Heisei");
    }else{
      System.out.println("TBD");
    }
  }
}
