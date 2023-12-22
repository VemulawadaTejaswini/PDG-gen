import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        String[] str = S.split("");

        int count = 0;

        int firstBlackIdx = 0;
        boolean firstBlack = false;

        int startIndex = 0;
        int endIndex = 0;
        boolean whiteTurn = false;

        boolean ngPattern = false;

        boolean beforeBlack = true;

        Map<Integer,Integer> indexMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if(".".equals(str[i])){
                if(!whiteTurn){
                    whiteTurn = true;
                    firstBlack = false;
                }
            }else{
                if(whiteTurn){
                    whiteTurn = false;
                    endIndex = i-1;
                    indexMap.put(startIndex,endIndex);
                }else if(!firstBlack){
                    firstBlack = true;
                    startIndex = i;
                }
            }
        }

        if(whiteTurn){
           endIndex = N-1;
           indexMap.put(startIndex,endIndex);
        }

//        System.out.println("map:"+indexMap);

        for(Map.Entry<Integer,Integer> entry:indexMap.entrySet()){
            int blackCount = 0;
            int whiteCount = 0;
            int start = entry.getKey();
            int end = entry.getValue();
            for (int i = start; i <= end; i++) {
                if ("#".equals(str[i])) {
                    blackCount++;
                } else {
                    whiteCount++;
                }
            }
            count += Math.min(blackCount, whiteCount);
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
