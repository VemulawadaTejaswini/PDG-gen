import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int happiness = 0;
    if (X >= 500) {
      happiness = (X/500)*1000;
      X -= (X/500)*500;
      
    }
    happiness += (X/5)*5;
    System.out.println(happiness);
  }
}