import java.util.Scanner;

class Main {



    public static int getMaxCost(int numberOfDays, int[] ah, int[] bh, int[] ch) {
        return getMaxCostHelper(0, numberOfDays, ah, bh, ch, 0, 0, 0);
    }

    private static int getMaxCostHelper(int day, int numberOfDays, int[] ah, int[] bh, int[] ch, int na, int nb, int nc) {
        if(day == numberOfDays) {
            return 0;
        }

        int poss1 = (na < 2) ? ah[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, na + 1, 0, 0) : Integer.MIN_VALUE;
        int poss2 = (nb < 2) ? bh[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, 0, nb + 1, 0) : Integer.MIN_VALUE;
        int poss3 = (nc < 2) ? ch[day] + getMaxCostHelper(day + 1, numberOfDays, ah, bh, ch, 0, 0 , nc + 1) : Integer.MIN_VALUE;

        return Math.max(poss1, Math.max(poss2, poss3));
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