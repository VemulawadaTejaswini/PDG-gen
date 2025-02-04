import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		//zyunbi
		int temp=0;
		int now=1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			if (S.charAt(i)-48==0+now) {
				temp++;
			} else {
				list.add(temp);
				now=1-now;
				temp=1;
				System.out.println(0+now);
			}
		}
		if (temp!=0) {
			list.add(temp);
		}
		if (list.size()%2==0) {
			list.add(0);
		}

		//ruiseki
		List<Integer> R = new ArrayList<Integer>();
		int X=0;
		R.add(0);
		for (int i=0;i<list.size();i++) {
			X=list.get(i)+R.get(i);
			R.add(X);
		}

		int add=2*K+1;
		int left;
		int right;
		int temp_A;
		int max=0;
		for (int i=0;i<R.size();i+=2) {
			left=i;
			right=Math.min(left+add,R.size()-1);
			temp_A=R.get(right)-R.get(left);
			max=Math.max(max,temp_A);
		}
		System.out.println(max);
	}
}