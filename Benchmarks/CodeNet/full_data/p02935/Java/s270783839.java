import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>(n);
    for (int i=0 ; i<n ; i++){
      a.add(sc.nextInt());
    }
    Collections.sort(a);
    double ans=a.get(0);
    for (int i=1 ; i<n ; i++){
      ans=(ans+a.get(i))/2;
    }
    
    System.out.println(ans);
  }
}