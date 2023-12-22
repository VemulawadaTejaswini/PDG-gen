import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        int[] array = new int[numCount];
        for(int i=0; i<numCount; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isBreak = false;
        int dividedCnt = 0;
        while(!isBreak) {
            for(int j=0; j<array.length; j++) {
                if(array[j] % 2 != 0) {
                    isBreak = true;
                    break;
                }
                array[j] = array[j] / 2;
            }
            if(!isBreak) {
                dividedCnt++;
            }
        }
        System.out.println(dividedCnt);
    }
}
