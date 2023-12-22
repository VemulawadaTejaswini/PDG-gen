import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List<StaGol> a = new ArrayList<StaGol>();
		boolean[] bridge = new boolean[n+1];

		for (int i = 0; i < m; i++) {
			a.add(new StaGol(sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(a);

		boolean flag;
		int sum=0;
		for(int i = 0;i<m;i++) {
			flag=false;
			for(int j=a.get(i).sta;j<=a.get(i).gol;j++) {
				if(bridge[j]) {
					flag=true;
					break;
				}
			}

			if(!flag) {
				bridge[a.get(i).gol-1]=true;
				sum++;
			}
		}
		System.out.println(sum);

		System.out.println();
		sc.close();
	}

}

class StaGol implements Comparable<StaGol> {
	public int sta;
	public int gol;
	public int dif;

	public StaGol(int sta, int gol) {
		this.sta = sta;
		this.gol = gol;
		this.dif = gol - sta;
	}

	@Override
	public int compareTo(StaGol o) {
		if (this.dif - o.dif != 0) {
			return this.dif - o.dif;
		} else if (this.sta - o.sta != 0) {
			return this.sta - o.sta;
		}
		return this.gol - o.gol;
	}

//	public String toString() {
//		return "dif:" + Integer.toString(dif) + ", sta:" + Integer.toString(sta) + ", gol:" + Integer.toString(gol) + "\n";
//	}

}
