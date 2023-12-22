import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] str;
		str = new String [N+1];
		for(int i=1;i<=N;i++){
			str[i]=sc.next();
		}
		
		for(int j=1;j<=N;j++){
			int v=0;
			if (map.containsKey(str[j])){
				v=map.get(str[j])+1;
			}
			else{
				v=1;
			}
			map.put(str[j], v);
		}
		//最大値を求める
		int max=-1;
			for (String key : map.keySet()) {
				if(max<map.get(key)){
					max=map.get(key);
				}
			}
		//最大値似mapするkeyをすべて求める
		List<String> list = new ArrayList<>();
		for (String key : map.keySet()) {
			if(map.get(key)==max){
			list.add(key);
			}
		}
		Collections.sort(list);
		for(int i=0;i<=list.size()-1;i++){
			System.out.println(list.get(i));
		}
	}
}