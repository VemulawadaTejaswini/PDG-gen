import java.util.*;

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

        boolean beforeBlack = false;

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

        List<Integer[]> countList = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:indexMap.entrySet()){
            int blackCount = 0;
            int whiteCount = 0;
            Map<String,Integer> map = new HashMap<>();
            int start = entry.getKey();
            int end = entry.getValue();
            for (int i = start; i <= end; i++) {
                if ("#".equals(str[i])) {
                    blackCount++;
                } else {
                    whiteCount++;
                }
            }
            Integer[] counts = new Integer[2];
            counts[0] = blackCount;
            counts[1] = whiteCount;
            countList.add(counts);
        }

        // start black
        int tempCount = 0;
        for(Integer[] counts : countList){
                tempCount += counts[1];
        }
//        System.out.println("allblack::"+tempCount);
        count = tempCount;

        // start white
        int allWhite = 0;
        for(Integer[] counts : countList){
            allWhite += counts[0];
        }
//        System.out.println("allWhite::"+allWhite);
        count = Math.min(count,allWhite);


        // white and black
        int length = countList.size() -1;
        tempCount = allWhite;
        for(int i=length; i>=0;i--){
            Integer[] counts = countList.get(i);
            tempCount = tempCount - counts[0] + counts[1];
//            System.out.println("BW::"+tempCount);
            count = Math.min(count,tempCount);
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
