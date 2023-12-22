import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextLong();
    List<long[]> en = new ArrayList<>();
    for(int i=0; i<N; i++){
      long Ai = nextInt();
      long Bi = nextInt();
      long[] li = new long[]{Ai, Bi};
      en.add(li);
    }
    Collection.sort(en, new Comparator(){
      public int compare(long[] l1, long[] l2){
        return l1[0] - l2[0];
      }
    });
    int sum = 0;
    for(int i=0; i<N; i++){
     int price = en.get(i)[0];
     int stock = en.get(i)[1];
     if(stock <= M){
       sum += price*stock;
       M -= stock;
     }else{
       sum += price*M;
     }
    }
    System.out.print(sum);
  }
}
