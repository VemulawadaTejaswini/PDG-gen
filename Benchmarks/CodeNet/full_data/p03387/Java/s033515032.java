import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] data = new int[3];

    for (int i = 0; i < 3; i++) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);
    int gap = data[2]-data[1] + data[2]-data[0];


    if (gap%2 == 0) {
      System.out.println(gap/2);
    } else {
      System.out.println((gap+1)/2+1);
    }

  }

}
