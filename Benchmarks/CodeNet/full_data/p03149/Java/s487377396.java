import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int[] res = new int[4];
    res[0] = cin.nextInt();
    res[1] = cin.nextInt();
    res[2] = cin.nextInt();
    res[3] = cin.nextInt();

    Arrays.sort(res);

    if (res[0]!=1) {
      System.out.println("NO");
      return;
    }
    if (res[1]!=4) {
      System.out.println("NO");
      return;
    }
    if (res[2]!=7) {
      System.out.println("NO");
      return;
    }
    if (res[3]!=9) {
      System.out.println("NO");
      return;
    }

    System.out.println("YES");
    
  }

}