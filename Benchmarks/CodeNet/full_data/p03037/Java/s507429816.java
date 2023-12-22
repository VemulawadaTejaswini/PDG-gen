import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int l = 0;
    int r = 0;
    int min = 0;
    int max = n;
    int ans = 0;

    for (int i=0; i<m; i++){
      l = Integer.parseInt(sc.next());
      r = Integer.parseInt(sc.next());
      if (l>min) { min=l; }
      if (max>r) { max=r; }
    }
    
    ans = max-min+1;
    if (ans<0) { ans=0; }
    System.out.println(ans);
    
  }
}
