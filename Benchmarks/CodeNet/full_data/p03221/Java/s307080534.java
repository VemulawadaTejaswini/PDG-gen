import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = sc.nextInt();
		int m = sc.nextInt();

		Hoge[] ds = new Hoge[m];
		
		for(int i=0; i<m; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			Hoge d = new Hoge(p, y);
			ds[i] = d;
		}
		Hoge[] cl = ds.clone();
		Arrays.sort(cl, Comparator.comparing(Hoge::getPref).thenComparing(Hoge::getYear));

		int id = 1;
		for(int i=0; i<m; i++) {
			if(i==0 || cl[i].getPref() != cl[i-1].getPref()) id = 1;
			cl[i].setId(id++);
		}
		
		for(int i=0; i<m; i++) System.out.println(ds[i]);
	}
}
class Hoge {
	int pref;
	int year;
	int id;

	Hoge(int p, int y) {
		pref = p;
		year = y;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getPref()
	{
		return pref;
	}

	public int getYear()
	{
		return year;
	}

	@Override
	public String toString()
	{
		return String.format("%06d%06d", pref, id);
	}
}