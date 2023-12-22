import java.util.*;

public class Main {
 public static void main(String... args) {
   List<String> weather = Arrays.asList("Sunny","Cloudy","Rainy","Sunny");
   Scanner scan = new Scanner(System.in);
   String S = scan.next();
   System.out.println(weather.get(weather.indexOf(S)+1));
 }
}