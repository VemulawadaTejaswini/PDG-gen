import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner read = new Scanner(System.in);
      String s = read.nextLine();
      if(s.equals ("Sunny")){
          System.out.println("Cloudy");
      }
      else if(s.equals( "Cloudy")){
          System.out.println("Rainy");
      }
      else{
          System.out.println("Sunny");
      }
    }
}