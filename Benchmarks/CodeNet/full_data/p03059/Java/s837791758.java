import java.util.*;

public class Main {
  
  private int A, B, T;
  
  public Main(String a, String b, String c) {
    this.A = Integer.parseInt(a);
    this.B = Integer.parseInt(b);
    this.T = Integer.parseInt(c);
  }
  
  private int getBuiscit () {
    System.out.println(T/A*B);
  }
    
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    Main obj = new Main(scan.nextInt(), scan.nextInt(), scan.nextInt());
    obj.getBuiscit();
    
  }
}
