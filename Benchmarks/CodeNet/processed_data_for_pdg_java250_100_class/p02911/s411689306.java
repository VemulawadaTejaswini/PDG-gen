public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int K =sc.nextInt();
      int Q =sc.nextInt();
      int n[] =new int[N];
      int a[] =new int[Q];
      for(int j=0; j<Q; j++){
      a[j] =sc.nextInt();
      }
      int kq = K-Q;
      Arrays.fill(n,kq);
      for(int j=0; j<Q; j++){
		n[a[j]-1]++;
      }
      for(int j=0; j<N; j++){
        if(n[j]<=0){
        System.out.println("No");
        }
        else{
        System.out.println("Yes");
        }
        }
    }
}
