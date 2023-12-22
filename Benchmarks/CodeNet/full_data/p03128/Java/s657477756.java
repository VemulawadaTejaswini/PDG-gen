import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int msCount = sc.nextInt();
        int usableNumberCount = sc.nextInt();
        List<Integer> usableNumbers = new ArrayList<Integer>();
        for (int i = 0; i < usableNumberCount; i++) {
            usableNumbers.add(sc.nextInt());
        }
        usableNumbers.sort(Comparator.naturalOrder());
        int[] msCountToUse = new int[]{0,2,5,5,4,5,6,3,7,6};
        
        int basicNumber = getLowestCostNumber(usableNumbers);
        int[] answer = new int[msCount / msCountToUse[basicNumber]];
        Arrays.fill(answer, basicNumber);
        int nowMSCount = msCountToUse[basicNumber] * answer.length;
        
        int n = usableNumbers.size();
        int answerIndex = 0;
        int msBN = msCountToUse[basicNumber];
        List<Integer> tmp = new ArrayList<Integer>();
        
        int tmpNum = -1;
        
        for (int unIndex = n - 1; unIndex >= 0; unIndex--) {
            int num = usableNumbers.get(unIndex);
            int msNum = msCountToUse[num];
            boolean msCountOver = msNum - msBN + nowMSCount > msCount;
            boolean justArrive = msNum - msBN + nowMSCount == msCount;
            
            if (msCountOver) continue;
                
            if (justArrive || num > basicNumber) {
                tmp.add(num);
                nowMSCount += msNum - msBN;
                if (nowMSCount == msCount) {
                    break;
                }
                unIndex = n;
                answerIndex++;
                tmpNum = -1;
            } else if (num < basicNumber && tmpNum == -1) {
                tmpNum = num;
                continue;
            }
            
            if (unIndex == 0) {
                tmp.add(tmpNum);
                nowMSCount += msCountToUse[tmpNum] - msBN;
                unIndex = n;
                answerIndex++;
                tmpNum = -1;
            }
        }
        
        tmp.sort(Comparator.reverseOrder());
        
        int index = answer.length - 1;
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        
        Arrays.sort(answer);
        
        for (int i = answer.length - 1; i >= 0; i--) {
            System.out.print(answer[i]);
        }
        System.out.println();
    }
    
    public static int getLowestCostNumber(List<Integer> usableNumbers) {
        if (usableNumbers.contains(1)) return 1;
        if (usableNumbers.contains(7)) return 7;
        if (usableNumbers.contains(4)) return 4;
        if (usableNumbers.contains(5)) return 5;
        if (usableNumbers.contains(3)) return 3;
        if (usableNumbers.contains(2)) return 2;
        if (usableNumbers.contains(9)) return 9;
        if (usableNumbers.contains(6)) return 6;
        // if (usableNumbers.contains(8))
        return 8;
    }
}