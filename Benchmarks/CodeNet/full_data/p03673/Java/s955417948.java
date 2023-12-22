import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    Deque<Integer> deq = new ArrayDeque<>();
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      if(N % 2 == i % 2){
        deq.addLast(n);
      }else{
        deq.addFirst(n);
      }
    }
    
    while(deq.size() > 1){
      System.out.print(deq.pop());
      System.out.print(" ");
    }
    System.out.println(deq.pop());
  }
}