import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sList = new String[n];
        for (int i = 0; i < n; i++) {
            sList[i] = scanner.next();
        }
        int m = scanner.nextInt();
        String[] mList = new String[m];
        for (int i = 0; i < m; i++) {
            mList[i] = scanner.next();
        }

        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(resultMap.containsKey(sList[i])){
                int tempNum = resultMap.get(sList[i]);
                resultMap.put(sList[i], ++tempNum);
            } else {
                resultMap.put(sList[i], 1);
            }
        }
        for (int i = 0; i < m; i++) {
            if(resultMap.containsKey(mList[i])){
                int tempNum = resultMap.get(mList[i]);
                resultMap.put(mList[i], --tempNum);
            } else {
                continue;
            }
        }
        int result = 0;
        for (Map.Entry<String, Integer> entry : resultMap.entrySet() ) {
           if(result < entry.getValue()){
               result = entry.getValue();
           } else {
               continue;
           }
        }
        System.out.println(result);
    }
}
