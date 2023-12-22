import java.util.Scanner;
//import java.util.Map;
//import java.util.HashMap;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[][] map = { {"Sunny", "Cloudy"}, {"Cloudy", "Rainy"}, {"Rainy", "Sunny"} };
    
 	String s = sc.next();

    int i = 0;
    for ( i = 0; i < map.length; i++) {
      if (map[i][0].equals(s)) {
        break;
      }
    }
    String result = map[i][1];
    
    

    System.out.println(result);
  }
}

