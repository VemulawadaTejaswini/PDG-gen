import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);


    String N = sc.next();
    int[] cubes = new int[2];
    cubes[0] = 0;
    cubes[1] = 0;
    for(int i = 0; i < N.length(); i++) {
      int tmp =(int)(  N.charAt(i) - '0' );
      cubes[tmp] += 1;
    }

    System.out.println(Math.min(cubes[0], cubes[1]) * 2);
  }
}
