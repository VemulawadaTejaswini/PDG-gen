import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(sc.nextLine()));
    }
    Collections.sort(list, Collections.reverseOrder());
    
    int point = 0;
    int ans = 0;
    for(int i = 0; i < N; i++){
      point += list.get(i);
      if(point % 10 != 0){
        ans = point;
      }
    }
    System.out.println(ans);
  }
}