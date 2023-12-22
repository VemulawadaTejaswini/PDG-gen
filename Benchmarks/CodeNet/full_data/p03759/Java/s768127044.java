import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[3];
    for(int i=0; i<array.length; i++) {
      array[i] = scanner.nextInt();
    }
    if(Math.abs(array[1]-array[0]) == Math.abs(array[2]-array[1])) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
