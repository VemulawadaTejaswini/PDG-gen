import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		
		List<List<Object>> sp = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			sp.add(Arrays.asList(sc.next(), sc.nextInt(),i));
		}
		
		sp.sort(new Comparator<List<Object>>() {

			@Override
			public int compare(List<Object> o1, List<Object> o2) {
				int x = ((String)o1.get(0)).compareTo((String)o2.get(0));
				if(x != 0) {
					return x;
				}
				
				return Integer.compare((Integer)o2.get(1), (Integer)o1.get(1));
			}
			
		});
		
		sc.close();

		for(List<Object> l : sp) {
			out.println(l.get(2));
		}
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
