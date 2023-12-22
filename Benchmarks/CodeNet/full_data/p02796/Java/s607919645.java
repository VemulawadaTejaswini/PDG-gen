import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
		List<Integer> list=new ArrayList<Integer>();
		/*List<Integer> list_left=new ArrayList<Integer>();
		List<Integer> list_right=new ArrayList<Integer>();*/
		for(int i=0;n>i;i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			mMap.put(x-l, x+l);
			list.add(x-l);
			/*list_left.add(x-l);
			list_right.add(x+l);*/
		}
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        List<Integer> list_left = new ArrayList<>(mMap.keySet());
        Collections.sort(list);
		for(int i=0;list.size()-1>i;i++) {
			int right = mMap.get(list.get(i));
			int left = list_left.get(i+1);
			//System.out.println(right+" "+left);
			if(right<left)
				n--;
		}
		System.out.println(n);
	}
}