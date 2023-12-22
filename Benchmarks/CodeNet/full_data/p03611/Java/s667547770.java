import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int N = sc.nextInt();
	for(int i = 0; i<N; i++) {
	    int x = sc.nextInt();
	    int c = (map.containsKey(x))? map.get(x):0;
	    map.put(x,c+1);
	    c = (map.containsKey(x-1))? map.get(x-1):0;
            map.put(x-1,c+1);
	    c = (map.containsKey(x+1))? map.get(x+1):0;
            map.put(x+1,c+1);
	}
	int max = 0;
	for(int key: map.keySet()) {
	    max = Math.max(map.get(key),max);
	}
	System.out.println(max);
    }
}