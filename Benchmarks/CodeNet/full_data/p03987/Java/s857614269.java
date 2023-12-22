import java.util.*;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    long sum = 0;
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(0);
    ts.add(n+1);
    for (int i = 1; i <= n; i++) {
      a[sc.nextInt()] = i;
    }
    for (int i = 1; i <= n; i++) {
      ts.add(a[i]);
      sum += i * (a[i] - ts.lower(a[i])) * (ts.higher(a[i]) - a[i]);
    }
    System.out.println(sum);
  }
}
