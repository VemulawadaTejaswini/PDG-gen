
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;

//		long[] b = new long[1000000000];

		HashMap<Integer,Long> map = new HashMap<Integer,Long>();


		for (int i=1; i < n+1;i++){
			map.put(i, sc.nextLong());
		}

		List<Entry<Integer, Long>> entries = new ArrayList<Entry<Integer, Long>>(map.entrySet());

		//Comparator で Map.Entry の値を比較
		Collections.sort(entries, new Comparator<Entry<Integer, Long>>() {

		    //比較関数
		    @Override
		    public int compare(Entry<Integer, Long> o1, Entry<Integer, Long> o2) {
		        return o1.getValue().compareTo(o2.getValue());    //昇順
		        //return o2.getValue().compareTo(o1.getValue());    //降順
		    }
		});

		long tmp = 0;

		for (Entry<Integer, Long> e : entries) {

			long val = e.getKey();
			if (Math.abs(tmp - val) > 2) ans++;
	//	    System.out.println(e.getKey() + " = " + e.getValue());
		    tmp = val;
		}



		System.out.println(ans/2);
		sc.close();
	}

}