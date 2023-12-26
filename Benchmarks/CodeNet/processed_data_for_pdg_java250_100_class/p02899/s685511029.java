public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int[] A = new int[N]; 
	  for(int i=1; i<=N; i++) {
		  int n = sc.nextInt();
		  A[n-1] = i; 
	  }
	  for(int i=0; i<N; i++) {
		  int n = A[i];
		  out.print(n + " ");
	  }
	  }	  
  }	
