import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int v[] = new int[N];
    int value = 0;
    for(int i=0; i<N; i++){
      v[i] = sc.nextInt();
    }
    Arrays.sort(v);
    value=v[0];
    for(int i=1; i<N; i++){
      value = (value + v[i])/2;
    }
    System.out.println(value);
  }
}