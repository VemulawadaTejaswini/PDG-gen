import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    list.add(Integer.parseInt(sc.nextLine()));
    
    for(int i = 1; i < N; i++){
      System.out.println(list);
      int a = Integer.parseInt(sc.nextLine());
      int lb = 0;
      int ub = list.size()-1;
      if(a <= list.get(ub)){
        list.add(a);
      }else if(a > list.get(lb)){
        list.set(0, a);
      }else{
        int mid = 0;
        while(ub-lb > 1){
          mid = (ub+lb)/2;
          if(a > list.get(mid)){
            ub = mid;
          }else{
            lb = mid;
          }
        }
        list.set(ub, a);
      }
    }
    System.out.println(list);
  }
}