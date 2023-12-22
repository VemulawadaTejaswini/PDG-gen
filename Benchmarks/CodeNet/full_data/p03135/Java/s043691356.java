import java.util.*;

class Main {
  public static float calcStudyTime(int T, int X) {
    return (float) T / X;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String line = scanner.nextLine();
    String[] values = line.split(" ", 0);

    int T = Integer.parseInt(values[0]);
    int X = Integer.parseInt(values[1]);
    
    System.out.println(calcStudyTime(T, X));
  }
}