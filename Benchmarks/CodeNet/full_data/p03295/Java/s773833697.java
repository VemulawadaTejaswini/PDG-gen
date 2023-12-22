
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] a = new int[m][2];
    for (int i = 0; i < m; i++){
      a[i][0] = scanner.nextInt();
      a[i][1] = scanner.nextInt();
    }
  Arrays.sort(a, Comparator.comparingInt(o -> o[1]));

  int count = 0;
  for (int i = 0; i < m;){
    count++;
    int right = a[i][1];
    i++;
    while (i < m && a[i][0] < right){
      i++;
    }
    System.out.println(count);
  }

  }
}
