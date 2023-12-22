import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    list.add(Integer.parseInt(sc.nextLine()));
    int lb = 0;
    int ub = 0;
    
    for(int i = 1; i < N; i++){
      int a = Integer.parseInt(sc.nextLine());
      if(a <= list.get(ub)){
        list.add(a);
        ub++;
        continue;
      }else if(a > list.get(lb)){
        continue;
      }else{
        int mid = 0;
        while(ub-lb > 1){
          mid = ub-lb;
          if(a > list.get(mid)){
            ub = mid;
          }else{
            lb = mid;
          }
        }
        list.set(mid, a);
      }
    }
    System.out.println(list.size());
  }
}