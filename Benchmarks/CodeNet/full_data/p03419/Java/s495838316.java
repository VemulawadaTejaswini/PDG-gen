import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int M = Integer.parseInt(sc.next());
      if(N == 1 && M == 1) System.out.println(1);
      else if( N == 1) System.out.println(M-2);
      else if( M == 1) System.out.println(N-2);
      else if(N == 2 || M == 2) System.out.println(0);
      else System.out.println((N-2)*(M-2));
  }
}