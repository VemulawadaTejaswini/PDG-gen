import java.util.Scanner;


public class ABC138a{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String tmp = scan.nextLine();
    int a = Integer.parseInt(tmp);
    String str = scan.nextLine();
    if(a>=3200){
      System.out.println(str);
    }else{
      System.out.println("red");
    }
    scan.close();
  }
}