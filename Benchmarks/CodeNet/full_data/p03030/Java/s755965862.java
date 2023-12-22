import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<String,TreeMap<Integer,Integer>> map = new TreeMap<String,TreeMap<Integer,Integer>>();
		String sa[] = new String[101];
		for(int i = 0; i < 101; i++){
			sa[i] = "";
		}
		int scou = 0;
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int p = sc.nextInt();
			if(!map.containsKey(s)){
				map.put(s,new TreeMap<Integer,Integer>());
				map.get(s).put(p,i);
				sa[scou] = s;
				scou++;
			}else{
				map.get(s).put(p,i);
			}
		}
		Arrays.sort(sa);
		for(int i = 100-scou+1; i < 101; i++){
			TreeMap<Integer,Integer> map2 = map.get(sa[i]);
			for(int j = 100; j >= 0; j--){
				if(map2.containsKey(j)){
					System.out.println(map2.get(j)+1);
				}
			}
		}
	}
}
