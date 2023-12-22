import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<String,Integer>();
		String tmp = sc.nextLine();
		for(int i = 0;i < n; ++i){
			String s = sc.nextLine();
			map.putIfAbsent(s,0);
			map.put(s,map.get(s) + 1);
		}
		SortedSet<String> st = new TreeSet<>();
		int maxi = 0;
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			maxi = Math.max(maxi,entry.getValue());
			// System.out.printf(" %s %d \n",entry.getKey(),entry.getValue());
		}
		// System.out.println(maxi);	
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			if(entry.getValue() == maxi){
				st.add(entry.getKey());
			}
		}

		for(String ele : st){
			System.out.println(ele);
		}
	}
}