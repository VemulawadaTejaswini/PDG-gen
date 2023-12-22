import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer a[] = new Integer[N];
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();      
    }
    Arrays.sort(a, Comparator.reverseOrder());
    
    int count = 0;
    
    for(int i = 1; i < N; i++){
      if(a[i-1].equals(a[i])){
        count = count + 1;
      }
      System.out.println(a[i-1]);
      System.out.println(a[i]);
    }
    
    System.out.println(a[0] + a[1]);
    
    if(count == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

}
}
