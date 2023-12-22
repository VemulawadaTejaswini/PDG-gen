import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prefectureNum = sc.nextInt();
		int cityNum = sc.nextInt();
		Map<String, List<String>> map = new HashMap<String, List<String>>():
		
		for(int i = 0; i < prefectureNum; i++){
			map.put(i+1, new ArrayList<String>());
		}
		
		for(int i = 0; i < cityNum; i++){
			map.get(sc.nextLine()).add(sc.nextLine());
		}
		
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue());
		foreach(String key : map.KeySet()){
			for(int i = 0; i < map.get(key).size(); i++){
				String keyAns = key;
				while(keyAns.length() <= 6){
					keyAns = "0" + keyAns;
				}
				String valAns = map.get(key).get(i);
				while(valAns.length() <= 6) {
					valAns = "0" + valAns;
				}
				System.out.println(keyAns + valAns);
			}
		}
	}
}