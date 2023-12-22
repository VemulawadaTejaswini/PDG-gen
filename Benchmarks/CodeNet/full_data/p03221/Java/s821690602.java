import java.util.Arrays;
import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		Hoge[] ds = new Hoge[m];
		Hoge[] cl = new Hoge[m];
		
		for(int i=0; i<m; i++) {
			int p = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			ds[i] = cl[i] = new Hoge(p, y);
		}
		Arrays.sort(cl);

		int id = 0;
		for(int i=0; i<m; i++) {
			if(i==0 || cl[i].pref != cl[i-1].pref) id = 0;
			cl[i].setId(++id);
		}
		
		for(int i=0; i<m; i++) System.out.println(ds[i]);
	}
}
class Hoge implements Comparable<Hoge>{
	int pref;
	int year;
	int id;

	Hoge(int p, int y) {
		pref = p;
		year = y;
	}
	
	@Override
	public int compareTo(Hoge o)
	{
		return pref<o.pref ? 1 : pref>o.pref ? -1 : Integer.compare(year, o.year);
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return String.format("%06d%06d", pref, id);
	}
}