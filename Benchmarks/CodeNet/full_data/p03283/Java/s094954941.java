import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int Q = sc.nextInt();
    for(int i=0;i<N;i++){
      Station[] stations = new Station[N+2];
    }
    for(int i=1;i<=M;i++){
      int L = sc.nextInt();
      int R = sc.nextInt();
      for(int j=L;j<=R;j++){
        stations[j].list.add(i);
      }
    }

    for(int i=1;i<=Q;i++){
      int count=0;
      int p = sc.nextInt();
      int q = sc.nextInt();
      ArrayList<Integer> subt1 = stations[p].list.subList(0 ,stations[p].list.size());
      subt1.retainAll(stations[p-1].list);
      ArrayList<Integer> subt2 = stations[q].list.subList(0 ,stations[q].list.size());
      subt2.retainAll(stations[q+1].list);
      subt1.addAll(subt2);
      ArrayList<Integer> answer = stations[p].list.subList(0 ,stations[p].list.size());
      for(int j=p+1;j<=q;j++){
        answer.retainAll(stations[j].list);
      }
    }
    for(int k : answer){
      count++;
    }
    System.out.println(count);
  }
}
public class Station{
  public void station(){
    ArrayList<Integer> list = new ArrayList<Integer>();
  }

}
