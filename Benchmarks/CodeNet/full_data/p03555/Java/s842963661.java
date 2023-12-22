import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
   

    String C = sc.next();
    StringBuffer sb = new StringBuffer(C);
    C = sb.reverse().toString();

    String D = sc.next();

    if(C.contains(D)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}