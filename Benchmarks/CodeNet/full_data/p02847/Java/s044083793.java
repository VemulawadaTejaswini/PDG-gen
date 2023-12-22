import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    switch(sc.next()){
      case "SUN":
        result++;
      case "MON":
        result++;
      case "TUE":
        result++;
      case "WED":
        result++;
      case "THU":
        result++;
      case "FRI":
        result++;
      case "SAT":
        result++;
    }
    System.out.println(result);
  }
}