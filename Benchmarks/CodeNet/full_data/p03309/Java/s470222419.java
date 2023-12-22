import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			int j = sc.nextInt();
			A.add(j);
		}
		int min = Integer.MAX_VALUE ;
		for(int i = 0 ; i < A.size() ; i++) {
			int b = A.get(i)-(i+1);
			if(!B.contains(b)) {
				B.add(b);
			}
		}
		for(int i = 0 ; i< B.size(); i++) {
			int absI = abs(A,B.get(i));
			if(absI<min) {
				min=absI;
			}
		}
		System.out.println(min);
	}
	public static int abs(List<Integer> A,int b) {
		int abs = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			abs += Math.abs(A.get(i)-(b+i+1));
		}
		return abs;
	}

}