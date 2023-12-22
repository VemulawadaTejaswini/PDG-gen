import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      String ans = "IMPOSSIBLE";
      List<Integer>list1 = new ArrayList<>();
      List<Integer>list2 = new ArrayList<>();
      for(int i = 0; i < M; i++){
        list1.add(sc.nextInt());
        list2.add(sc.nextInt());
      }
      for(int j = 0; j < M; j++){
        if(list2.get(j) == N){
          for(int l = 0; l < M; l++){
            if(list1.get(l) == 1){
              ans = "POSSIBLE";
              break;
            }
          }
        }
      }
      System.out.println(ans);
    }
}
