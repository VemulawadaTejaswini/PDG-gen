import java.util.*;

 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer a[] = new Integer[N];
    for(int i=0; i<N ;i++){
        a[i] = sc.nextInt();
    }
    Arrays.sort(a, Comparator.reverseOrder());
    int sum = 0;
    for(int k =0; k<K ;k++){
        sum += a[k];
    }
    System.out.println(sum); 
}
    
}
