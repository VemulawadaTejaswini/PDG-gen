import java.util.*;
public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int N = sc.nextInt();
			// スペース区切りの整数の入力
			int M = sc.nextInt();
			ArrayList<Integer> A = new ArrayList<Integer>();
			int B = 0;
			int C = 0;
			long sum = 0;
			for (int i = 0; i<N ; i++){
				A.add(sc.nextInt());
			}
			int min = Collections.max(A);
			
			for (int i = 0; i<M ; i++){
				B=sc.nextInt();
				C=sc.nextInt();
				if(min<C){
					for (int j = 0; j<B ; j++){
						A.add(C);
					}
				}
			}
			for (int i = 0; i<N ; i++){
				sum += (long)Collections.max(A);
				A.remove(A.indexOf(Collections.max(A)));
			}
			System.out.println(sum);
		}

	}