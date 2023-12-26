public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      int a[] = new int[N];
      int count = 0;
      int max = 0;
      for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      }
       for(int i=1; i<N; i++){
        if(a[i-1]>=a[i]){
        count++;
        }
         else{
         max = Math.max(max,count);
           count =0;
         }
       }
      max = Math.max(max,count);
         System.out.println(max);
    }
}
