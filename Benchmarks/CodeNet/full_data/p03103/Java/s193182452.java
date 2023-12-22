import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		long money = 0; //ここに値を入れる
		for(int i =0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		boolean flag = false; //trueの時forをスキップ
		int min =0;
		while(M>0) {
			min = 0;
			
				for(int i =0; i<N; i++) {
					if(B[i]<=0)continue;
					if(A[i]<A[min]) {
						min =i;
						flag = true;
					}
				}
				
				for(int i=0; i<B[min];i++) {
					if(M<=0)break;
					money+=A[min];
					M--;
					
				}
				B[min] = 0;
				
			}
			
		System.out.println(money);
			
		}
		
		
		
	}