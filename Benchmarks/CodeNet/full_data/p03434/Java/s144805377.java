import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = 0;
    int B = 0;
    Integer[] array = new Integer[N];
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    Arrays.sort(array,Collections.reverseOrder());
    for(int i=0; i<array.length; i++){
      if(i%2==0){
        A+=array[i];
      }else{
        B+=array[i];
      }
    }
    System.out.println(Math.abs(A - B));
  }
}