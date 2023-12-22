import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    // 入力値の読み込み
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    ArrayList<Pair> list = new ArrayList<>();
    for(int i=0; i<N; i++){
      list.add(new Pair(sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(
      list,
      new Comparator<Pair>(){
        public int compare(Pair obj1, Pair obj2){
          return obj1.B - obj2.B;
        }
      }
    );
    String status = "Yes";
    int sumtime = 0;
    for(int i=0; i<list.size(); i++){
      sumtime += list.get(i).A;
      if(sumtime <= list.get(i).B){
        continue;
      }
      status = "No";
    }
    System.out.print(status);
  }  
}

class Pair{
  public int A = 0; //単位時間
  public int B = 0; //終了時刻
  public Pair(int A, int B){
    this.A = A;
    this.B = B;
  }
}