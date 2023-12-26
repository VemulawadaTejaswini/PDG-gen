public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int M = sc.nextInt(); 
    int[] A = new int[N]; 
    int sum = 0; 
    int cnt = 0; 
    String S = ""; 
      for(int i=0; i<N; i++) { 
        A[i]=sc.nextInt(); 
        sum += A[i];
      }
      for(int i=0; i<N; i++){
        if(A[i]*4*M >= sum){
          cnt++;
        } 
      }
      if(cnt>=M) {
        S="Yes";
      } else {
        S="No";
      }
    System.out.println(S);
  }
}
