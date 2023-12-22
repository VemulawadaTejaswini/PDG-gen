import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<int[]> list = new ArrayList<int[]>();
		for (int i=0;i<M;i++) {
			int P = Integer.parseInt(sc.next());
			int Y = Integer.parseInt(sc.next());
			int[] tmp = {i, P, Y , 0};
			list.add(tmp);
		}
		Collections.sort(list, (o1, o2) -> Integer.compare(o1[2], o2[2]));
		Collections.sort(list, (o1, o2) -> Integer.compare(o1[1], o2[1]));
		int index=1;
		int former=0;
		for (int i=0;i<M;i++) {
			if (former==list.get(i)[1]) {
				index++;
				list.get(i)[3]=index;
				former=list.get(i)[1];
			} else {
				index=1;
				list.get(i)[3]=index;
				former=list.get(i)[1];
			}
		}

		Collections.sort(list, (o1, o2) -> Integer.compare(o1[0], o2[0]));
		for (int i=0;i<M;i++) {
			String ans = String.format("%06d%06d",list.get(i)[1],list.get(i)[3]);
			System.out.println(ans);
		}
	}
}