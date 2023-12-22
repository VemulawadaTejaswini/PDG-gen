import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(S[i]));
    }
    Collections.sort(list);
    if(N % 2 == 0){
      for(int i = 0; i < N-1 ; i+=2){
        if(list.get(i) != i+1 || list.get(i+1) != i+1){
          System.out.println(0);
          return;
        }
      }
    }else{
      for(int i = 1; i < N-1 ; i+=2){
        if(list.get(i) != i+1 || list.get(i+1) != i+1){
          System.out.println(0);
          return;
        }
      }
    }
    
    long ans = 2;
    for(int i = 1; i < N/2; i++){
      ans = ans * 2 % 1000000007;
    }
    System.out.println(ans);
  }
}