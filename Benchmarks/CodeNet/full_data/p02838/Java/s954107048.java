import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numberList.add(Long.parseLong(sc.next()));
        }
        
        int combination[][] = getCombination(n);
        long sum = 0;
        for (int i = 0; i < combination.length; i++) {
            sum += numberList.get(combination[i][0]) ^ numberList.get(combination[i][1]);
        }

        

        System.out.println(sum % 1000000007);
    }

    private static int[][] getCombination (int size) {
        int combi = size;
        for (int i = size - 1; i > 2; i--) {
            combi *= i;
        }

        int[][] combination = new int[combi][2];

        int listNo = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                combination[listNo][0] = i;
                combination[listNo][1] = j;
                listNo++;
            }
        }
        return combination;
    }
}
