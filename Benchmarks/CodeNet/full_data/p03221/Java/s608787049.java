import java.util.*;

public class Main {

    public static void main(String[] args){
        //  System.setIn(new FileInputStream("D:/samleInput.txt"));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> inputMap = new TreeMap<Integer, Integer>();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        Map<Integer,String> resultCodeMap = new HashMap<Integer, String>();

        for (int i=0;i<m;i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            inputMap.put(y, p);
            linkedHashMap.put(y, p);
        }
        Set<Integer> keySet = inputMap.keySet();
        Iterator<Integer> iter = keySet.iterator();
        int []partCitynum = new int[n+1];
        while (iter.hasNext()) {
            int yearKey = iter.next();
            int zone = inputMap.get(yearKey);
            partCitynum[zone] ++;
            String resultCode = insertOO(String.valueOf(zone))+insertOO(String.valueOf(partCitynum[zone]));
            resultCodeMap.put(yearKey,resultCode);
        }

        Set<Integer> keySet1 = linkedHashMap.keySet();
        Iterator<Integer> iter1 = keySet1.iterator();
        while (iter1.hasNext()){
            int year = iter1.next();
            String resultCode = resultCodeMap.get(year);
            System.out.println(resultCode);
        }
    }

    private static String insertOO(String code){

        char a[] = code.toCharArray();
        while (a.length<6){
            code= "0"+code;
            a = code.toCharArray();
        }
        return code;
    }
}