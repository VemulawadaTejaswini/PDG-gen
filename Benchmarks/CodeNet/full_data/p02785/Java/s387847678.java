import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int numOfMonster = enter.nextInt();
        int numOfSpecialMoves = enter.nextInt();
        long monsterlifes[] = new long[numOfMonster];
        long addition = 0;

        long max = monsterlifes[0];
        for (int i = 0; i < monsterlifes.length; i++) {
            monsterlifes[i] = enter.nextInt();}
            Arrays.sort(monsterlifes);
            for (int j = numOfMonster - numOfSpecialMoves - 1; j >= 0; j--)

                addition += monsterlifes[j];


        System.out.println(addition);


    }
}