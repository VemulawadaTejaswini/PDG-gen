import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if ((a==1 || a==2) && (b==1 || b==2)) {
      System.out.println("3");
    }
    else if ((a==1 || a==3) && (b==1 || b==3)) {
      System.out.println("2");
    }
    else{
      System.out.println("1");
    }

  }
}
