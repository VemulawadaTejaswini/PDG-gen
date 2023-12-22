import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long h = scanner.nextLong();
    long pow = 1;
    long count = 0;

    while(h != 0){
        count += pow;
        h /= 2;
        pow *= 2;
    }
    System.out.println(count);

  }
}
