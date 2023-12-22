import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);              

     int n = sc.nextInt();
     
     int a[] = new int[n];
     
     for(int i = 0;i < n;i++){
         a[i] = sc.nextInt();
     }
          
     
     Deque<Integer>   q = new ArrayDeque<Integer>();     
     Deque<Integer> ans = new ArrayDeque<Integer>();
     
     for(int i = 0;i < n;i++){
        while(ans.size() != 0){
             q.addLast(ans.removeFirst());
        }
        q.addLast(a[i]);       
        while(q.size() != 0){
            ans.addLast(q.removeLast());
        }
     }

    while(ans.size() != 0){     
       System.out.print(ans.removeFirst() + " ");
    }
    System.out.println();
     
  }
    
}