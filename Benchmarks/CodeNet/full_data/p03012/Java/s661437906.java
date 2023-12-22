import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int ELEMENTS = SC.nextInt();
    private static final int[]  VALUE = load(SC);
    private static int[] load(Scanner sc){
        int[] value = new int[ELEMENTS];
        for (int i = 0; i < ELEMENTS; i++) {
            value[i] = sc.nextInt();
        }
        return value;
    }

    public static void main(String[] args) {
        int sumOfAll = 0;
        for (int i: VALUE){
            sumOfAll += i;
        }

        int turningPoint = 0;
        int partialSum = 0;
        for (int i=0;i<VALUE.length;i++){
            partialSum += VALUE[i];
            sumOfAll -= VALUE[i];
            if(sumOfAll-partialSum<0){
                turningPoint = i;
                break;
            }
        }

        int resultA = partialSum-sumOfAll;
        int resultB = sumOfAll-partialSum+2*VALUE[turningPoint];

        System.out.println(Math.min(resultA,resultB));
    }
}

