import java.util.Scanner;

public class Main {

  private static double tax = 1.08;

  public static void main(String... args) {
    try {
      Scanner s = new Scanner(System.in);
      int rememberedPrice = s.nextInt();
      int original = (int)((double)rememberedPrice / tax);
      System.out.println(original);
      
    } catch (Exception e) {
      System.out.println(":(");
    }
  }

}
