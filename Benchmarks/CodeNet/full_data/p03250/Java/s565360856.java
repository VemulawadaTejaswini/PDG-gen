import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] data = new int[3];

    for (int i = 0; i < 3; i++) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);

    String x = data[2] +""+ (int)data[1];
    int y = Integer.parseInt(x);
    System.out.println(y + data[0]);


  }

}
