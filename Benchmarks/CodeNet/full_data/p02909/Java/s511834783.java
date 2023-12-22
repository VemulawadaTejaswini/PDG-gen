import java.util.Scanner;

public class Many{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    String S=scan.next();
   if(S.equals("Sunny")){
     System.out.println("Cloudy");
     }
   if(S.equals("Cloudy")){
     System.out.println("Rainy");
     }
   if(S.equals("Rainy")){
     System.out.println("Sunny");
     }
  }
}