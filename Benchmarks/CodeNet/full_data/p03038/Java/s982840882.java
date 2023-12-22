import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] Array;
    Array = new int[N];
    for ( int i = 0 ; i < N ; i++ ){
      Array[i] = sc.nextInt();
    }
    int[] B;
    B = new int[M];
    int[] C;
    C = new int[M];
    for ( int i = 0 ; i < M ; i++ ){
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
    }

    Arrays.sort(Array); //Arrayを小さい順に並べかえる

    List<Integer> Xs = new ArrayList<>();
    for ( int i=0 ; i < M ; i++ ){
      while(B[i]>0){
        Xs.add( C[i] ) ;
        B[i]-- ;
      }
    }

    Collections.sort(Xs, Collections.reverseOrder()); //Xを降順
    int size =Xs.size();

    Integer[] X = Xs.toArray(new Integer[size]);
  
    if (X[0]>1000000){
      long sum=0;
    }else{
      int sum = 0;
    }
    for ( int i=0 ; i < N ; i++ ){
      if (i==size){sum +=Array[i];}
      else {
        if( Array[i] < X[i] ){
          Array[i] = X[i] ;
        }
      sum +=Array[i];
      }
    }
    System.out.println(sum);
  }
}