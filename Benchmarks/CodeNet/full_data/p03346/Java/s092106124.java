import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> pList = new ArrayList<>();
		for (int i=0; i<N; i++){
			int P = sc.nextInt();
			pList.add(P);
		}

		int ansFwd = 0;
		int first = pList.indexOf(1);
		List<Integer> noMoveFwdList = new ArrayList<>();
		noMoveFwdList.add(1);
		for (int i=first; i<N; i++) {
			int n = pList.get(i);
			if(n == noMoveFwdList.get(ansFwd)+1) {
				noMoveFwdList.add(n);
				ansFwd++;
			}
		}
		ansFwd = N -ansFwd - 1;

		int ansBck = 0;
		int last = pList.indexOf(N);
		List<Integer> noMoveBckList = new ArrayList<>();
		noMoveBckList.add(N);
		for (int i=last; i>=0; i--) {
			int n = pList.get(i);
			if(n == noMoveBckList.get(ansBck)-1) {
				noMoveBckList.add(n);
				ansBck++;
			}
		}
		ansBck= N - ansBck - 1;


		int ans = Math.min(ansFwd, ansBck);

		System.out.println(ans);
	}
}

