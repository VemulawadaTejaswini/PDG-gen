import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prefectureNum = sc.nextInt();
		int cityNum = sc.nextInt();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		String[][] array = new String[cityNum][2];
		for(int i = 0; i < prefectureNum; i++){
			map.put(String.valueOf(i+1), new ArrayList<String>());
		}
		for(int i = 0; i < cityNum; i++){
		    array[i][0] = sc.next();
			array[i][1] = sc.next();
			map.get(array[i][0]).add(array[i][1]);
		}
		
		for(String key : map.keySet()){
			Collections.sort(map.get(key));
			for(int i = 0; i < map.get(key).size(); i++){
				String keyAns = key;
				while(keyAns.length() < 6){
					keyAns = "0" + keyAns;
				}
				String valAns = String.valueOf(i + 1);
				while(valAns.length() < 6) {
					valAns = "0" + valAns;
				}
				for(int j = 0; j < array.length; j++){
				    if(array[j][0].equals(key)){
				        if(array[j][1].equals(map.get(key).get(i))){
				            array[j][0] = keyAns;
				            array[j][1] = valAns;
				        }
				    }
				}
			}
		}
		for(String[] ary2 : array){
		    System.out.println(ary2[0] + ary2[1]);
		}
	}
}