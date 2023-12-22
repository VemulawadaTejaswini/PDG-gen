import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.nextLine();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            list.add(scan.nextLine());
        }

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(n2 -> n2,Collectors.counting()));

        Map<Long, String> outMap = new HashMap<>();
        map.forEach((key,value) -> {
            String s = outMap.get(value);
            if(s == null) {
                outMap.put(value,key);
            }
            else {
                outMap.put(value,s + "\n" + key);
            }
        });
        Object[] mapKey = outMap.keySet().toArray();
        Arrays.sort(mapKey, Collections.reverseOrder());
        System.out.println(outMap.get(mapKey[0]));
    }
}