import java.util.*;
import static java.lang.System.*;
 
class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int P[] = new int[M];
    int Y[] = new int[M];
    List<List> A = new ArrayList<List>(N);
    for(int i=0; i<N; i++){
      List<Integer> B = new ArrayList<Integer>();
      A.add(B);
    }      
    for(int i=0; i<M; i++){
      P[i] = Integer.parseInt(sc.next());
      Y[i] = Integer.parseInt(sc.next());
      A.get(P[i]-1).add(Y[i]);
    }
    for(int i=0; i<N; i++){
      Collections.sort(A.get(i));
    }
    for(int i=0; i<M; i++){
      int x = Collections.binarySearch(A.get(P[i]-1), Y[i]) + 1;
      out.printf("%06d%06d\n",P[i],x);
    }
    
  }
 
  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}