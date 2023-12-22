import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int b = 0;
    int c = 0;
	ArrayList<Integer> a = new ArrayList<>();
    int e = 0;
    long ans = 0;

    for (int i=0; i<n; i++){
      a.add(Integer.parseInt(sc.next()));
    }
    
    for (int i=0; i<m; i++){
      b = Integer.parseInt(sc.next());
      c = Integer.parseInt(sc.next());
      for (int j=0; j<b; j++){
        a.add(c);
      }
    }
    
    Collections.sort(a, Collections.reverseOrder());
    System.out.println(a);
    
    for (int i=0; i<n; i++){
      ans += a.get(i);
    }

    System.out.println(ans);
    
  }
}
