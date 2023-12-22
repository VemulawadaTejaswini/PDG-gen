import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static int N, M;
	static int[][] DATA;

	static Queue<SortByP> queueP = new PriorityQueue<SortByP>();

	static Queue<SortByIndex> queueIndex = new PriorityQueue<SortByIndex>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lineArr = br.readLine().split(" ");
		N = Integer.parseInt(lineArr[0]);
		M = Integer.parseInt(lineArr[1]);

		DATA = new int[M][3];

		for (int i = 0; i < M; i++) {
			lineArr = br.readLine().split(" ");

			queueP.add(new SortByP(Integer.parseInt(lineArr[0]), Integer.parseInt(lineArr[1]), 0, i + 1));
		}

		int currentP = -1;
		int tmpOrder = 0;
		while (queueP.size() > 0) {
			SortByP sp = queueP.poll();

			if (sp.p != currentP) {
				currentP = sp.p;
				tmpOrder = 0;
			}
			tmpOrder++;

			queueIndex.add(new SortByIndex(sp.p, sp.y, tmpOrder, sp.index));
		}

		StringBuffer sb;
		while (queueIndex.size() > 0) {
			SortByIndex si = queueIndex.poll();
			sb = new StringBuffer();

			currentP = si.p;

			String strCurrentP = Integer.toString(currentP);
			int tmp = 6 - strCurrentP.length();

			for (int i = 0; i < tmp; i++) {
				sb.append("0");
			}
			sb.append(strCurrentP);

			tmpOrder = si.order;
			String strTmpOrder = Integer.toString(tmpOrder);
			tmp = 6 - strTmpOrder.length();

			for (int i = 0; i < tmp; i++) {
				sb.append("0");
			}
			sb.append(strTmpOrder);

			System.out.println(sb.toString());
		}

	}
}

class SortByP implements Comparable<SortByP> {
	int p, y, order = 0, index;

	public SortByP(int p, int y, int order, int index) {
		super();
		this.p = p;
		this.y = y;
		this.order = order;
		this.index = index;
	}

	@Override
	public int compareTo(SortByP o) {
		if (this.p - o.p != 0)
			return this.p - o.p;
		else
			return this.y - o.y;
	}

}

class SortByIndex implements Comparable<SortByIndex> {
	int p, y, order = 0, index;

	public SortByIndex(int p, int y, int order, int index) {
		super();
		this.p = p;
		this.y = y;
		this.order = order;
		this.index = index;
	}

	@Override
	public int compareTo(SortByIndex o) {
		return this.index - o.index;
	}

}