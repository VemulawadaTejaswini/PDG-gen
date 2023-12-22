import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<Integer>();
    int sum = 0;
    for (int i = 0; i < N  ; i++) {
      int x = sc.nextInt();
      A.add(x);
      sum = sum +x;
    }
    Collections.sort(A);
    Collections.reverse(A);
    int y = sum / (4*M);

    for (int j = 0; j < M; j++) {
      // System.out.println(A.get(j)); 
      if(y <= A.get(j)){
      }else{
        System.out.println("No"); 
        return;
      }
    } 
    System.out.println("Yes"); 
    return;
  }
}

