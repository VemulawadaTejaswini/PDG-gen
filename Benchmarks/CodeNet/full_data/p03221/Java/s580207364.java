import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[N];
		int[] Pm = new int[M];
		int[] Ym = new int[M];
		int[][] Ykey = new int[N][M];
		List<ArrayList<Integer>> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<M;i++) {
			Pm[i] = sc.nextInt();
			Ym[i] = sc.nextInt();
			list.get(Pm[i]-1).add(i);
		}
		for(int i=0;i<list.size();i++) {
			for(int k=0;k<list.get(i).size();k++) {
				for(int y=k;y<list.get(i).size()-1;y++) {
					int now = Ym[list.get(i).get(y)];
					int after = Ym[list.get(i).get(y+1)];
					if(now > after) {
						int temp = list.get(i).get(y);
						list.get(i).set(y,list.get(i).get(y+1));
						list.get(i).set(y+1,temp);
					}
				}
			}
		}

		for(int i=0;i<M;i++) {
			int rank = -1;
			for(int k=0;k<list.get(Pm[i]-1).size();k++) {
				if(list.get(Pm[i]-1).get(k) == i) {
					rank = k;
					break;
				}
			}
			System.out.printf("%06d%06d%n",Pm[i],rank+1);
		}

		sc.close();
	}



}
