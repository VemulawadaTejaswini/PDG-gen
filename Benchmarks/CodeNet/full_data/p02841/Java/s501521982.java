import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int[] data1 = new int[2];
    int[] data2 = new int[2];

    for (int i = 0 ; i < 2 ; i++ ) {
      data1[i] = sc.nextInt();
    }
    for (int i = 0 ; i < 2 ; i++ ) {
      data2[i] = sc.nextInt();
    }

    if (data2[1] == 1) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }

  }
}
