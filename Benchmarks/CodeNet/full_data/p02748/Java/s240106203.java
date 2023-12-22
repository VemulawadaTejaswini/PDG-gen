import java.util.*;

class Main{
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int[] A = new int[sc.nextInt()];
		int[] B = new int[sc.nextInt()];
		int[][] M = new int[sc.nextInt()][3];
		
		for(int i = 0; i < A.length; i++){
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < B.length; i++){
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < M.length; i++){
			M[i][0] = sc.nextInt() - 1;
          	M[i][1] = sc.nextInt() - 1;
          	M[i][2] = sc.nextInt();
		}
		
		List<Integer> ret = new ArrayList<>();
      	for(int i = 0; i < A.length; i++){
           int a = Arrays.stream(A).min().getAsInt();
           int b = Arrays.stream(A).min().getAsInt();
           int ab = a+b;
           ret.add(ab);
        }
		for(int i = 0; i < M.length; i++){
			int cul = A[M[i][0]] + B[M[i][1]] - M[i][2];
			ret.add(cul);
		}
		System.out.println(ret.stream().min(Comparator.naturalOrder()).get());
	}

}