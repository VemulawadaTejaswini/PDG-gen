import java.util.*;



public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		 Map<String, Integer> mMap = new HashMap<String, Integer>();
		 while(N > 0) {
			 String str = sc.next();
			if(mMap.containsKey(str)) {
				mMap.put(str,(mMap.get(str)+1));
			}
			else {
                mMap.put(str,1);
            }
			 if (mMap.get(str) > max) {
	                max = mMap.get(str);
	            }
			N--;
		 }
	        List<String> result = new ArrayList<>();
	        for (String str: mMap.keySet()){
	            if(mMap.get(str) == max){
	                result.add(str);
	            }
	        }
	        Collections.sort(result);
	        for(String s : result) {
	        	System.out.println(s);
	        }
	}
}