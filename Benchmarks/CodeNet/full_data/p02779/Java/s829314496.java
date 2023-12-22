import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(sc.next());
        for(int j = 0; j < i; j++){
          if(i != j && arr[i] == arr[j]){
            System.out.print("NO");
            return;
          }
        }
    }
    System.out.print("YES");
}  
}