import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M]; 
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<M;i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      if(a[i]==1){
        list.add(i);
      }
    }
    String ans = "IMPOSSIBLE";
    for(int i=0;i<list.size();i++){
      for(int j=0;j<M;j++){
        if(a[j]==b[list.get(i)] && b[j]==N){
          ans = "POSSIBLE";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}