import java.util.*;
import java.io.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
      String weather = sc.next();
      if(weather == "Sunny") {
        out.println("Cloudy");
      }
      if(weather == "Cloudy") {
        out.println("Rainy");
      }
      if(weather == "Rainy") {
        out.println("Sunny");
      }
    }
}