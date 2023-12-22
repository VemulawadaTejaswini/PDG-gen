public class Main {
  
  public static void main(String... args) {
    int i1 = args[0];
    int i2 = args[1];
    int i3 = args[2];
    int result = i1 + i2 + i3;
    
    if (result > 21) {
      System.out.println("bust");
    } else {
      System.out.println("win");
    }
  }
  
}
