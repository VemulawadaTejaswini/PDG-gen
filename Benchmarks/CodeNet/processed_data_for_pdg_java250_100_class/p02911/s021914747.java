public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int Q=sc.nextInt();
		int[] arrayAnsCount=new int[Q];
		int[] arrayPoint=new int[N];
		int intervalValue=K-Q;
		Arrays.fill(arrayPoint, intervalValue);
		for(int i=0;i<arrayAnsCount.length;i++) {
			arrayAnsCount[i]=sc.nextInt();
			arrayPoint[arrayAnsCount[i]-1]=arrayPoint[arrayAnsCount[i]-1]+1;	
		}
		for(int i=0;i<N;i++) {
			if(arrayPoint[i]>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
