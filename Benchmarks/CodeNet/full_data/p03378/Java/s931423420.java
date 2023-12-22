import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int N;
    int M;
    int X;
    int i;
    int a = 0;
    int b = 0;
    int[] A =new int[99];
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    X = sc.nextInt();
    i = M;
    for(i=1;i<=M;i++){
      A[i] = sc.nextInt();
      if(A[i] > X){
        a++ ;
    }else{
        b++ ;
      }
    }

    if(a <= b){
      System.out.println(a);
    }else{
      System.out.println(b);
    }
  }
}
