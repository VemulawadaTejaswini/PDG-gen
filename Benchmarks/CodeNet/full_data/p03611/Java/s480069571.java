
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    int x[] = new int[100002];
    for(int i=0;i<N;i++){
      x[a[i]]++;
      x[a[i]+2]++;
      x[a[i]+1]++;
    }
    Arrays.sort(x);
  System.out.println(x[100001]);
  }
    


}
