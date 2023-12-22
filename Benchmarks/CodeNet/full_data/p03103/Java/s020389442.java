import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] stores = new int[n][2];

    for (int i = 0; i < n; ++i) {
      stores[i][0] = sc.nextInt();
      stores[i][1] = sc.nextInt();
    }

    stores = mergeSort(stores);

    int sum = 0;
    long cost = 0;
    int i = 0;
    while (sum < m) {
      if (stores[i][1] == 0)
        ++i;
      --stores[i][1];
      ++sum;
      cost += stores[i][0];
    }

    System.out.println(cost);
  }

  public static int[][] mergeSort(int[][] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    int[][] left = new int[mid][2];
    int[][] right = new int[a.length - mid][2];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];
    for (int i = a.length - mid; i < a.length; ++i)
      right[i - a.length + mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static int[][] merge(int[][] l, int[][] r) {
    int[][] a = new int[l.length + r.length][2];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i][0] < r[j][0] || l[i][0] < r[j][0] && l[i][1] >= r[i][1])
        a[k++] = l[i++];
      else
        a[k++] = r[j++];
    }

    while (i < l.length)
      a[k++] = l[i++];
    while (j < r.length)
      a[k++] = r[j++];

    return a;
  }
}