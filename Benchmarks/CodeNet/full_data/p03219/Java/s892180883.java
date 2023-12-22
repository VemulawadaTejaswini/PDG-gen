import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prefectureNum = sc.nextInt();
		int cityNum = sc.nextInt();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		String[][] array = new String[cityNum][2];
		for(int i = 0; i < prefectureNum; i++){
			map.put(String.valueOf(i+1), new ArrayList<Integer>());
		}
		for(int i = 0; i < cityNum; i++){
		    array[i][0] = sc.next();
			array[i][1] = sc.next();
			map.get(array[i][0]).add(Integer.parseInt(array[i][1]));
		}
		
		for(String key : map.keySet()){
			Collections.sort(map.get(key));
			for(int i = 0; i < map.get(key).size(); i++){
				for(int j = 0; j < array.length; j++){
			        if(array[j][0].equals(key) && Integer.parseInt(array[j][1]) == (map.get(key).get(i))){
				        array[j][0] = String.format("%06d%06d",Integer.parseInt(key),i + 1);
                        break;
				    }
				}
			}
		}
		for(String[] ary2 : array){
		    System.out.println(ary2[0]);
		}
	}
}
