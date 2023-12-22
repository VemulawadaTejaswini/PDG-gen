import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long ans=0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[]=new int[N+1];
		int BC[][]=new int[M+1][2+1];
		List<Integer> B_C = new ArrayList<>();
		for(int i=1;i<=N;i++){
			A[i] = sc.nextInt();
		}
		for(int j=1;j<=M;j++){
		//	BC[j][1]=sc.nextInt();
		//	BC[j][2]=sc.nextInt();
			for(int k=1;k<=sc.nextInt();k++){
				B_C.add(sc.nextInt());
			}
		}
		Arrays.sort(A);
		Collections.sort(B_C, Collections.reverseOrder());
		for(int i=0;i<=B_C.size()-1;i++){
			if (A[i+1]<B_C.get(i)){
				A[i+1]=B_C.get(i);
			}
			else{
			break;
			}
		}
		for(int i=1;i<=N;i++){
			ans=ans+A[i];
		}

		System.out.println(ans);
    }
}