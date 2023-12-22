import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int Ans = 0;
    int N = s.nextInt();
    int M = s.nextInt();
    int size = 0;
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();
    ArrayList<Integer> C = new ArrayList<Integer>();
    for (int i=0;i<N;i++){
      A.add(s.nextInt());
      B.add(s.nextInt());
    }
    for (int Day = M;Day >= 0;Day--){
      int d =0;
      d = 0;
      int uts = 0;
      uts = 0;
      int utl = 0;
      utl = 0;
      while ( utl + Day <= M){
        uts = A.get(d);
        utl = B.get(d);
        d += 1;
        if (d >= N){
          break;
        }
      }
      int Record = d-1;
      for (int i = d; i < A.size() -1;i++){
        if (uts <= A.get(i) && B.get(i) + Day <M){
          uts = A.get(i);
          utl = B.get(i);
          Record = i;
        }
      }
      Ans += uts;
      A.remove(Record);
      B.remove(Record);
    }
    System.out.println(Ans);
  }
}