import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer a[] = new Integer[N];
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();      
    }
    Arrays.sort(a, Comparator.naturalOrder());
    
    int judge = 0;
    
    for(int i = 1; i < N; i++){
      if(a[i-1] == a[i]){
        judge++;
      }
    }
    if(judge == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

}
}
