import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    if(str.equals("Rainy")){
      System.out.println("Sunny");
    }else if(str.equals("Sunny")){
      System.out.println("Cloudy");
    }else{
      System.out.println("Rainy");
    }
  }
 }