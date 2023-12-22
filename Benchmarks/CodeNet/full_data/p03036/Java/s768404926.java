import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    long tmp = (long)Integer.parseInt(sc.next());  
    for(int i = 0; i < 10; i++) {
      tmp = r * tmp - d;
      System.out.println(tmp);
    }     
  }
}