import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Long[] A = new Long[N];
		Integer[] B = new Integer[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextLong();
			B[i]=sc.nextInt();
		}
		Long[] C = new Long[N];
		for (int i=0;i<N;i++) {
			C[i]=A[i];
		}
		Arrays.sort(A);
		List<Long> AA = Arrays.asList(A);
		List<Long> AAA = new ArrayList<Long>(AA);
		List<Integer> BB = Arrays.asList(B);
		List<Integer> BBB = new ArrayList<Integer>(BB);
		List<Long> CC = Arrays.asList(C);
		List<Long> CCC = new ArrayList<Long>(CC);
		List<Integer> D = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			D.add(BBB.get(CCC.indexOf(AAA.get(i))));
			CCC.set(CCC.indexOf(AAA.get(i)),(long)-1);
		}
		int num=0;
		Long cost=(long)0;
		while (M>0) {
			if (M>=D.get(num)) {
				M=M-D.get(num);
				cost=cost+AAA.get(num)*D.get(num);
				num++;
			}else {
				break;
			}
		}
		if (M>0) {
			cost=cost+AAA.get(num)*M;
		}
		System.out.println(cost);
	}
}