import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String S=scan.nextLine();
    switch(S){
      case "Sunny":
      	System.out.println("Cloudy");
      	break;

      case "Rainy":
      	System.out.println("Sunny");
        break;
      
      case "Cloudy":
        System.out.println("Rainy");
        break;

    }
  }
}