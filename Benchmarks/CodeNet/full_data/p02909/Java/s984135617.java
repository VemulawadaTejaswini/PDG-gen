import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    switch (str){
      case "Sunnny":
        System.out.println("Cloudy");
        break;
      case "Cloudy":
        System.out.println("Rainy");
        break;
      default:
         System.out.println("Sunny");
        break;
    }
  }
}