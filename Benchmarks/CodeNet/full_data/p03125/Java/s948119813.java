import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String strA = scan.next();
    String strB = scan.next();
    int intA = Integer.parseInt(strA);
    int intB = Integer.parseInt(strB);
    if (intB%intA == 0){
    	System.out.println(intA+intB);

    }else{

    	System.out.println(intB - intA);
  }
}
  }