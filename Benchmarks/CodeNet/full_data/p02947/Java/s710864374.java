import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i = 0; i < n; i++){
			int[] a = new int[10];
			for(int j = 0; j < 10; j++){
				a[j] = s[i].charAt(j);
			}
			Arrays.sort(a);
			int b = 0;
			for(int j = 0; j < 10; j++){
				b*=10;
				b+=a[j];
			}
			if(map.containsKey(b)){
				map.put(b,map.get(b)+1);
			}else{
				map.put(b,0);
			}
		}
		long ans = 0;
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			long tmp = map.get(key)*(map.get(key)+1)/2;
			ans+=tmp;
		}
		System.out.print(ans);
	}
}
