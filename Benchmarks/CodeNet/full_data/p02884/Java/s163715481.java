import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer> s = new ArrayList<>();
		ArrayList<Integer> t = new ArrayList<>();

		for(int i=0;i<m;i++) {
			s.add(sc.nextInt());
			t.add(sc.nextInt());
		}

		double[] p = new double[n+1];


		double min =700;

		for(int i =1;i<n;i++) {//どこからの枝を狩るか
			for(int j =0;j<n+1;j++) {
				p[j]=0;
			}
			for(int j=n-1;j>0;j--) {//動的計画法
				ArrayList<Integer> branch = new ArrayList<>();
				for(int k =0;k<s.size();k++) {
					if(s.get(k)==j) {
						branch.add(k);
					}
				}

				if(i==j&&branch.size()!=1) {//
					
					double max = 0;
					int maxIndex = -1;
					for(int k=0;k<branch.size();k++) {
						if(p[t.get(branch.get(k))]>max) {
							max = p[t.get(branch.get(k))];
							maxIndex = k;
						}
					}
					if(maxIndex!=-1)branch.remove(maxIndex);
				}

				for(int k=0;k<branch.size();k++) {
					p[j]+=(p[t.get(branch.get(k))]+1.0)*(1.0/branch.size());
				}

			}
			if(min>p[1])min=p[1];
		}




		//String s = sc.next();

		//String[] ss = s.split("");

		//int[] a = new int[n];


		double ans = min;

		System.out.println(ans);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
