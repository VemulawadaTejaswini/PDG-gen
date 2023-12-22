import java.util.*;

class Main {
  public static String sayChristmas(int day) {
    String phrase = "Christmas";
    if(25 - day > 0) {
      for(int i = 0; i < 25 - day; i++) {
        phrase += " Eve";
      }
    }
    return phrase;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int day = Integer.parseInt(scanner.nextLine());
    
    System.out.println(sayChristmas(day));
  }
}