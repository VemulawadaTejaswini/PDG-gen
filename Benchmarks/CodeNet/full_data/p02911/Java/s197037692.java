import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int people = sc.nextInt();
    int point = sc.nextInt();
    int q_cnt = sc.nextInt();
    int[] correcter = new int[q_cnt];
    int[] points = new int[people];
    
    for(int i = 0; i < q_cnt; i++){
       correcter[i] = sc.nextInt();
    }
    
    for(int i = 0; i < people; i++){
      for(int j = 0; j < q_cnt; j++){
        if(correcter[j] - 1 != i){
          points[i]--;
        }
      }
    }
    
    for(int i = 0; i < people; i++){
      if(points[i] + point >= 1){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}