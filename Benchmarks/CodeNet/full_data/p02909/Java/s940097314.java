import java.util.*;
import java.io.*;
 
class Main {
	
	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      
      String weather = sc.next();
      
      if(weather == "Sunny") {
        System.out.println("Cloudy");
      }
      if(weather == "Cloudy") {
        System.out.println("Rainy");
      }
      if(weather == "Rainy") {
        System.out.println("Sunny");
      }
    }
}