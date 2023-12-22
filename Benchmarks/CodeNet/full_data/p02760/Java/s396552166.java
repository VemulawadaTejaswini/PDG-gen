import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // A11 A12 A13
        // A21 A22 A23
        // A31 A32 A33
        // N b1 b2 ... bn
        // ビンゴカード A が N 個の数列 bn で 1 ビンゴできるなら Yes そうでなければ No
        Scanner sc = new Scanner(System.in);
        int[] bingoNum = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        boolean[] hitArray = {false, false, false, false, false, false, false, false, false};
        int numNum = sc.nextInt();
        for(int i = 0; i < numNum; i++) {
            int tempNum = sc.nextInt();
            for (int j = 0; j < 9; j++) {
                if (bingoNum[j] == tempNum) {
                    hitArray[j] = true;
                }
            }
        }
        boolean resR1 = hitArray[0] & hitArray[1] & hitArray[2];
        boolean resR2 = hitArray[3] & hitArray[4] & hitArray[5];
        boolean resR3 = hitArray[6] & hitArray[7] & hitArray[8];
        boolean resR4 = hitArray[0] & hitArray[3] & hitArray[6];
        boolean resR5 = hitArray[1] & hitArray[4] & hitArray[7];
        boolean resR6 = hitArray[2] & hitArray[5] & hitArray[8];
        boolean resR7 = hitArray[0] & hitArray[4] & hitArray[8];
        boolean resR8 = hitArray[2] & hitArray[4] & hitArray[6];
        if(resR1 || resR2 || resR3 || resR4 || resR5 || resR6 || resR7 || resR8){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
