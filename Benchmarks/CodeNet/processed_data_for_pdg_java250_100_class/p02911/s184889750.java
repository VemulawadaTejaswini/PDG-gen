public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
	  int N = sc.nextInt();
      int K = sc.nextInt();
      int Q = sc.nextInt();
      int[] A = new int[Q]; 
      int[] P = new int[N];
      for(int i=0;i<Q;i++){
        A[i] = sc.nextInt();
        P[A[i]-1]++;
      }
      for(int i=0;i<N;i++){
        if(P[i]+K-Q>0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}
