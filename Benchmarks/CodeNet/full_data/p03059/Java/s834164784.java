import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] array = scanner.nextLine().split(" ");
    int A = Integer.parseInt(array[0]);
    int B = Integer.parseInt(array[1]);
    int T = Integer.parseInt(array[2]);
    
   	int now = A;
    int num = 0;
    while(now <= T) {
      now += A;
      num += B;
    }
    System.out.println(num);
  }
}