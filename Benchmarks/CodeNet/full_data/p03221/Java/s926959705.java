import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        Map<Integer, Integer>yearPrefMap = new TreeMap<>();
//        List<City> citys  = new ArrayList<>();
        for(int i = 0 ; i < m ; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
//            City param = new City();
//            param.setPref(p[i]);
//            param.setYear(y[i]);
//            citys.add(param);
            yearPrefMap.put(y[i], p[i]);
        }
//        Collections.sort(citys, new TestComparator());
        int[] prefectureArray = new int[100001];
        Map<Integer, Integer> cityIndexMap = new HashMap<>();
//        for (int i = 0 ; i < m ; i++ ) {
//            prefectureArray[citys.get(i).getPref()]++;
//            cityIndexMap.put(citys.get(i).getYear(), prefectureArray[citys.get(i).getPref()]);
//        }
        for (Map.Entry<Integer, Integer> entry : yearPrefMap.entrySet()) {
            prefectureArray[entry.getValue()]++;
            cityIndexMap.put(entry.getKey(), prefectureArray[entry.getValue()]);
        }
        for (int i = 0 ; i < m ; i++) {
            System.out.print(String.format("%06d", p[i]));
            System.out.print(String.format("%06d", cityIndexMap.get(y[i])));
            System.out.println("");
        }
    }

}