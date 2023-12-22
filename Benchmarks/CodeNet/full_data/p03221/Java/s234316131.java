import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prefectureNum = Integer.parseInt(sc.next());
		int cityNum = Integer.parseInt(sc.next());
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		List<String> array1 = new ArrayList<String>();
        List<String> array2 = new ArrayList<String>();
		for(int i = 0; i < prefectureNum; i++){
			map.put(String.valueOf(i+1), new ArrayList<Integer>());
		}
		for(int i = 0; i < cityNum; i++){
		    array1.add(sc.next());
			array2.add(sc.next());
			map.get(array1.get(i)).add(Integer.parseInt(array2.get(i)));
		}
		for(String key : map.keySet()){
			Collections.sort(map.get(key));
			for(int i = 0; i < map.get(key).size(); i++){
		        if(array2.indexOf(String.valueOf(map.get(key).get(i))) != -1){
			       array1.set(array1.indexOf(key), String.format("%06d%06d",Integer.parseInt(key),i + 1));
	      		}
			}
		}
		for(String ary2 : array1){
		    System.out.println(ary2);
		}
	}
}