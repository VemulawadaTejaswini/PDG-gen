import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int p = sc.nextInt();
    
    int kakera = 3*a + p;
    int ap = kakera/2;
    System.out.println(ap);
  }
}