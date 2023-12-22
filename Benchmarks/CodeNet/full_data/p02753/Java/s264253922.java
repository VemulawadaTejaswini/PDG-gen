import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String a = "AAA" , b = "BBB";
    if( s.equals(a) || s.equals(b) ){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
    sc.close();
  }
}