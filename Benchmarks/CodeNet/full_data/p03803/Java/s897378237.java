import java.util.Random;

class Main{
  private static final int N=13;
  private static int[] A=new int[N];
  private static int[] B=new int[N];
  
  static void poker(int[] A, int[] B){
    for(int i=0; i<N; i++){
      if(A[i]==1 && B[i]==1){
        System.out.println("Draw");
      }else if(A[i]>B[i] && A[i]==1){
        System.out.println("Alice");
      }else if(A[i]<B[i] && B[i]==1){
        System.out.println("Bob");
      }
    }
  }
  public static void main(String args[]){
    Random random=new Random();
    
    for(int i=0; i<N; i++){
      A[i]=random.nextInt(13);
      B[i]=random.nextInt(13);
    }
    poker(A,B);
  }
}