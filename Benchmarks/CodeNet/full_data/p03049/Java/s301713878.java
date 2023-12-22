import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int ELEMENTS = SC.nextInt();
    private static final ABString[]  STRINGS = load(SC);
    private static ABString[] load(Scanner sc){
        ABString[] abs = new ABString[ELEMENTS];
        for (int i = 0; i < ELEMENTS; i++) {
            abs[i] =  new ABString(sc.next());
        }
        return abs;
    }

    public static void main(String[] args) {
        int numOfA = 0;
        int numOfB = 0;
        int maxOfAB = 0;

        for(ABString abs : STRINGS){
            switch (abs.getMajority()){
                case 'A':
                    numOfA++;
                    break;
                case 'B':
                    numOfB++;
                    break;
                default:
            }
            maxOfAB += abs.getNumOfABCouple();
        }

        maxOfAB += Math.min(numOfA,numOfB);
        System.out.println(maxOfAB-1);
    }
}

class ABString{
    private int numOfABCouple = 0;
    private char majority = 'X';

    int getNumOfABCouple() {
        return numOfABCouple;
    }

    char getMajority() {
        return majority;
    }

    ABString(String s) {
        int numOfA = 0;
        int numOfB = 0;
        for(char c: s.toCharArray()){
            switch(c){
                case 'A':
                    numOfA++;
                    break;
                case 'B':
                    numOfB++;
                    break;
                default:
            }
        }
        this.numOfABCouple = Math.min(numOfA, numOfB);

        if (numOfA < numOfB){
            majority = 'B';
        }else if (numOfB < numOfA){
            majority = 'A';
        }


    }
}
