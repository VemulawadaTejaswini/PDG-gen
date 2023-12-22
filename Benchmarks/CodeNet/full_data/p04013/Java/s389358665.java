import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

class main {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		List<Integer> x = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			x.add(tmp - a);
		}
		
		HashMap<Integer,Long> mapa=new HashMap<Integer,Long>();
		HashMap<Integer,Long> mapb=new HashMap<Integer,Long>();
		
		mapa.put(0,1L);
		mapb.put(0, 1L);

		
		for (Integer num : x) {
			for (Entry<Integer, Long> entry : mapb.entrySet()) {
				int sum = entry.getKey() + num;
				long way = entry.getValue();
				if(mapa.containsKey(sum)){
					mapa.put(sum, mapa.get(sum) + way);
				}else{
					mapa.put(sum, way);
				}
			}
			mapb.clear();
			mapb.putAll(mapa);
		}
		System.out.println(mapb.get(0)-1);
	}
}
