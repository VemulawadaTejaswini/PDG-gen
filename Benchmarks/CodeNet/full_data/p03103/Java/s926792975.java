import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Long, Integer> mMap = new HashMap<Long, Integer>();
		for(int i=0;n>i;i++) {
			long a = sc.nextLong();
			int b = sc.nextInt();
			mMap.put(a, b);
		}
		Object[] mapkey = mMap.keySet().toArray();
		Arrays.sort(mapkey);
		long money=0;
		long count=0;
		loop:for (Long nKey : mMap.keySet()){
			int b = (mMap.get(nKey));
			for(int i=b;0<i;i--) {
				if(count==m)
					break loop;
				money = money+nKey;
				count++;
			}
		}
		System.out.println(money);
	}
}