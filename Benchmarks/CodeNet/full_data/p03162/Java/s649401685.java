import java.util.Arrays;
import java.util.Scanner;

class Main {



    public static int getMaxCost(int numberOfDays, int[] ah, int[] bh, int[] ch) {
        int[][] memo = new int[numberOfDays][4];
        for(int i=0;i<numberOfDays;i++)
            Arrays.fill(memo[i], -1);
        return getMaxCostHelper(0, numberOfDays, ah, bh, ch, 3, memo);
    }

    private static int getMaxCostHelper(int day, int numberOfDays, int[] ah, int[] bh, int[] ch, int taken,
                                        int[][] memo) {
        if(day == numberOfDays) {
            return 0;
        }

        if(memo[day][taken] != -1) {
            return memo[day][taken];
        }


        int poss1 = (taken != 0) ? ah[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, 0, memo) : Integer.MIN_VALUE;
        int poss2 = (taken != 1) ? bh[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, 1, memo) : Integer.MIN_VALUE;
        int poss3 = (taken != 2) ? ch[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, 2, memo) : Integer.MIN_VALUE;

        return memo[day][taken] = Math.max(poss1, Math.max(poss2, poss3));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = scanner.nextInt();
        int[] aH = new int[numberOfDays];
        int[] bH = new int[numberOfDays];
        int[] cH = new int[numberOfDays];

        for(int i=0; i<numberOfDays; i++) {
            aH[i] = scanner.nextInt();
            bH[i] = scanner.nextInt();
            cH[i] = scanner.nextInt();
        }
        System.out.println(getMaxCost(numberOfDays, aH, bH, cH));
    }

}