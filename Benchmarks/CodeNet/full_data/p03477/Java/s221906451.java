import java.util.*;
public class Main {
  public static void main(String...args) {
  	final Scanner sc = new Scanner(System.in);
    final int left = sc.nextInt() + sc.nextInt();
    final int right = sc.nextInt() + sc.nextInt();
    final int sigum = Math.signum(left - right);
    switch(signum) {
      case 0: System.out.println("Balanced"); break;
      case 1: System.out.println("Left"); break;
      case -1: System.out.println("Right"); break;
    }
  }
}