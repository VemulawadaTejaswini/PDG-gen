import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    int n = Integer.parseInt(br.readLine());
	    int[] v = Arrays.stream(br.readLine().split("[\\s]+"))
		.mapToInt(Integer::parseInt).toArray();
	    Map<Integer,Integer> map1 = new HashMap<>();
	    for (int i=0;i<n;i+=2) {
		int count = map1.containsKey(v[i]) ? map1.get(v[i])+1 : 1;
		map1.put(v[i],count);
	    }
	    Map<Integer,Integer> map2 = new HashMap<>();
	    for (int i=1;i<n;i+=2) {
		int count = map2.containsKey(v[i]) ? map2.get(v[i])+1 : 1;
		map2.put(v[i],count);
	    }
	    Entry<Integer,Integer> conv1 = map1.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).findFirst().orElse(null);
	    Entry<Integer,Integer> conv2 = map1.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).skip(1).findFirst().orElse(null);
	    Entry<Integer,Integer> conc1 = map2.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).findFirst().orElse(null);
	    Entry<Integer,Integer> conc2 = map2.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).skip(1).findFirst().orElse(null);
	    int ans = n - (conv1.getValue()+conc1.getValue());
	    if (conv1.getKey() == conc1.getKey()) {
		if (conv2 == null && conc2 == null) {
		    ans = n/2;
		} else if (conv2 == null) {
		    ans = n/2 - conc2.getValue();
		} else if (conc2 == null) {
		    ans = n/2 - conv2.getValue();
		} else {
		    ans = conv1.getValue()+conc2.getValue() > conv2.getValue()+conc1.getValue() ?
			n - (conv1.getValue()+conc2.getValue()) : n - (conv2.getValue()+conc1.getValue());
		}
	    }
	    System.out.println(ans);
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }
}