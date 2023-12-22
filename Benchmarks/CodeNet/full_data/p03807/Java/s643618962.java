import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		int sum_odd=0;
		int N=0;
		
		try {
			N=(int)System.in.read();
			//System.out.printf("N=%d", N);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			try {
				A[i]=System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.printf("%D", A[i]);
		}
		
		for(int i=0;i<N;i++){
			if(A[i]%2==1){
				sum_odd+=1;
			}
		}
		if(sum_odd%2==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		//System.out.println(sum_odd);
		

	}
	//missionは、行った場所もしくは、いけない場所は0にする。


}