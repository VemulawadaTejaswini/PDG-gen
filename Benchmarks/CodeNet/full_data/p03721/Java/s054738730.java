public class Main{

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner (System.in);
		int N=scanner.nextInt() ;
		int K=scanner.nextInt() ;
		
		int a[]=new int[N+1];
		int b[]=new int[N+1];
		
		for(int i=1;i<=N;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
		}
		int array[]=new int[100000+1];
		for(int i=0;i<=100000;i++){
			array[i]=0;
		}
		for(int i=1;i<=N;i++){
			array[a[i]]+=b[i];
		}
		int count=0;
		for(int i=1;i<=N;i++){
			count+=array[i];
			if(count>=K){
				System.out.println(a[i]);
				break;
			}
		}
		
	}

}