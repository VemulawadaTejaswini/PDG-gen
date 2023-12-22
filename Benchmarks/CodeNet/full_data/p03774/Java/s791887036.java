
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static int[][] point;
	public static int m;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		m = in.nextInt();

		int[][] stud = new int[n][2];
		for(int i=0; i<n; i++){
			stud[i][0] = in.nextInt();
			stud[i][1] = in.nextInt();
		}

		point = new int[m][2];
		for(int i=0; i<m; i++){
			point[i][0] = in.nextInt();
			point[i][1] = in.nextInt();
		}

		for(int i=0; i<n; i++){
			Manhattan(stud[i][0], stud[i][1]);
		}
	}

	static void Manhattan(int a, int b) {
		HashMap<Integer, Integer> man = new HashMap<>();
		for(int i=0; i<m; i++){
			man.put(i, Math.abs(a - point[i][0]) + Math.abs(b - point[i][1]));
		}
		List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(man.entrySet());
		Collections.sort(entries, new Comparator(){
		    public int compare(Object o1, Object o2){
		        Map.Entry e1 =(Map.Entry)o1;
		        Map.Entry e2 =(Map.Entry)o2;
		        return ((Integer)e1.getValue()).compareTo((Integer)e2.getValue());
		    }
		});

		for (Entry<Integer,Integer> s : entries) {
            System.out.println(s.getKey()+1);
            break;
        }

	}

}

