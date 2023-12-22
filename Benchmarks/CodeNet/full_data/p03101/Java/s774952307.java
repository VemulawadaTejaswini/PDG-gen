import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    int cols = scanner.nextInt();
    
    int nonRows = scanner.nextInt();
    int nonCols = scanner.nextInt();
    
    System.out.println((rows - nonRows) * (cols - nonCols));
  }
}