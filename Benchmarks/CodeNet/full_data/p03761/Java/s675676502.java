import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("5\r\nabcdabcd\r\naabc\r\nbcc\r\naabbcc\r\nabcdbcd");
        
        // 文字列の数
        int strNum = sc.nextInt();
        // 文字列のリスト
        List<Map<String, Integer>> strArray = new ArrayList<>();
        while(sc.hasNext()) {
            String line = sc.next();
            String[] charArray = line.split("");
            Map<String, Integer> charMap = new HashMap<>();
            for(String charVal : charArray) {
                
                if(charMap.containsKey(charVal)) {
                    int count = charMap.get(charVal);
                    charMap.put(charVal, count + 1);
                } else {
                    charMap.put(charVal, 1);
                }
            }
            strArray.add(charMap);
        }
        
        Map<String, Integer> sampleMap = strArray.get(0);
        
        String strContainedAll = "";
        
        for(String key : sampleMap.keySet()) {
            boolean containsAll = false;
            int allCount = sampleMap.get(key);
            
            for(int i=1; i<strArray.size(); i++) {
                Map<String, Integer> otherMap = strArray.get(i);
                
                if(otherMap.containsKey(key)) {
                    int count = otherMap.get(key);
                    if(allCount > count) {
                        allCount = count;
                    }
                    containsAll = true;                    
                } else {
                    containsAll = false;
		            break;
                }
            }
            
            if(containsAll) {
                strContainedAll += new String(new char[allCount]).replace("\0", key);
            }
        }
        System.out.println(strContainedAll);
    }
}
