import java.util.*

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ab = sc.nextInt();
    int bc = sc.nextInt();
    int ca = sc.nextInt();
    
    double area;
    if (ca > ab && ca > bc) {
      area = ab * bc * 0.5;
    } else if (ab > bc & ab > ca) {
      area = bc * ca * 0.5;
    } else {
      area = ab * ca * 0.5;
    }
    
    System.out.println(area);
  }
  
  
  
}
