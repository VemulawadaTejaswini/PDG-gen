import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());

    int[] list1 = {a,b,c};
    Arrays.sort(list1);

    System.out.println(list1[0] + list1[1]);

}
}
