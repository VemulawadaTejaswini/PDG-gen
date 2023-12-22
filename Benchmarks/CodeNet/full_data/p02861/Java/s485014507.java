import java.util.*;
import java.awt.*;

public class Main {

  double total = 0;
  int count = 0;
  Point[] town;


  public Main(Point[] town){
    this.town = town;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int townnum = Integer.parseInt(sc.next());
    Point[] town = new Point[townnum];
    int[] arr = new int[townnum];

    for(int i = 0; i < townnum; i++)
      arr[i] = i;

    for(int i = 0; i < townnum; i++){
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      Point point = new Point(x, y);
      town[i] = point;
    }
    Main main = new Main(town);

    main.permute(arr);

    System.out.println(main.getTotal()/main.getCount());
  }

  // swap 2 elements of an array,
  void swap(int[] arr, int x, int y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
  }

  /**
   * print permutations of array
   * @param arr
   *            original int array,
   */
  void permute(int[] arr) {
      permute(arr, 0, arr.length - 1);
  }

  /**
   * print permutations of array
   *
   * @param arr
   *            original int array,
   * @param i
   *            start index
   * @param n
   *            end index
   */
  void permute(int[] arr, int i, int n) {
      int j;
      if (i == n){
          for(int k = 0; k < arr.length-1; k++){
            total += town[arr[k]].distance(town[arr[k+1]]);
          }
          count++;
      }
      else {
          for (j = i; j <= n; j++) {
              swap(arr, i, j);
              permute(arr, i + 1, n);
              swap(arr, i, j); // backtrack
          }
      }
  }

  public double getTotal(){
    return total;
  }

  public int getCount(){
    return count;
  }
}