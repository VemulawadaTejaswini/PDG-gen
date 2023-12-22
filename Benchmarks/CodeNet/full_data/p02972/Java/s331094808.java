import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    int[] b = new int[n];
    ArrayList<Integer> c = new ArrayList<Integer>();
    for (int i=n-1;i>=0;i--){
      if ((b[i] % 2) != a[i]){
        c.add(i+1);
        b = add1(b,i+1);
      }
    }

    Collections.sort(c);
    System.out.println(c.size());
    if (c.size() == 0){
      return;
    }
    for (int j=0;j<c.size()-1;j++){
      System.out.print(c.get(j) +" ");
    }
    System.out.println(c.get(c.size()-1));
  }

  static int[] add1(int[] a, int b){
    int g = (int) Math.sqrt(b);
    if (g*g == b){
      a[g-1] -= 1;
    }

    for (int i=g;i>=1;i--){
      if ((b%i) == 0){
        a[i-1] += 1;
        int t = (int) b/i;
        a[t-1] += 1;
      }
    }
    return a;
  }
}
