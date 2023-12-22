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
      List<Integer> ans = new ArrayList();
     
     for(int i = 0;i < n;i++){
        ans.add(a[i]);       
        Collections.reverse(ans);
     }

    for(int i = 0;i < ans.size();i++){
        System.out.print(ans.get(i)+ " ");
    }
    
    System.out.println();
     
  }   
}