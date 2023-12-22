import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int b = 0;
    int c = 0;
	ArrayList<Integer> d = new ArrayList<>();
    int e = 0;
    long ans = 0;

    for (int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    
    for (int i=0; i<m; i++){
      b = Integer.parseInt(sc.next());
      c = Integer.parseInt(sc.next());
      for (int j=0; j<b; j++){
        d.add(c);
      }
    }
    
    if (d.size() < n){
      for (int i=0; i<n; i++){
        d.add(0);
      }
    }
    
    Collections.sort(d, Collections.reverseOrder());
    //System.out.println(d);
    
    for (int i=0; i<n; i++){
      e = d.get(i);
      if (a[i]<e) { a[i]=e; }
    }
    
    for (int i=0; i<n; i++){
      ans+= a[i];
    }

    System.out.println(ans);
    
  }
}
