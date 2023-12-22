import java.util.Scanner;
import java.util.TreeSet;

public class Main{
  static int n, k;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    k = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int count = 0;
    for(int i = 0; i < n; i++){
      if(a[i] >= k){
        ++count;
      }
    }

    int[] b = new int[n - count];
    int m = 0;
    for(int i = 0; i < n; i++){
      if(a[i] < k){
        b[m++] = a[i];
      }
    }

    TreeSet< Integer > set = new TreeSet< >();
    for(int i = 0; i < m; i++){
      set.add(b[i]);
    }

    int ans = 0;
    for(int i = 0; i < m; i++){
      set.remove(b[i]);
      if(!check(i, b, set)){
        ++ans;
      }
      set.add(b[i]);
    }

    System.out.println(ans);
  }

  private static boolean check(int index, int[] b, TreeSet< Integer > set){
    int m = set.size();
    if(set.higher(k - b[index] - 1) != null){
      return true;
    }

    for(int i = 0; i < b.length; i++){
      if(i != index){
        set.remove(b[i]);
        Integer lb = set.lower(k - b[i] + 1);
        if(lb != null){
          if(b[i] + lb >= k - b[index] &&
              b[i] + lb < k){
            set.add(b[i]);
            return true;
          }
        }
        set.add(b[i]);
      }
    }

    return false;
  }
}