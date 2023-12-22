import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class Main{
          public static void main(String[] args) {
                  Scanner scan = new Scanner(System.in);
                  int N = scan.nextInt();
                  int result = 0;
                  for (int i = 1; i <= N; i++) {
                          result += i;
                  }
                  System.out.println(result);
                  }
}
