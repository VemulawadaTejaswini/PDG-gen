import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNumber = sc.nextInt();
        int[] trueNumbers = new int[peopleNumber];
        if (peopleNumber % 2 == 0) {
            for (int i = 0; i < peopleNumber; i = i + 2) {
                trueNumbers[i] = i + 1;
                trueNumbers[i + 1] = i + 1;
            }
        } else {
            trueNumbers[0] = 0;
            for (int i = 1; i < peopleNumber; i = i + 2) {
                trueNumbers[i] = i + 1;
                trueNumbers[i + 1] = i + 1;
            }
        }

        int targetNumbers [] = new int[peopleNumber];
        for (int i = 0; i < peopleNumber; i++) {
            targetNumbers[i] = sc.nextInt();
        }
        Arrays.sort(targetNumbers);

        boolean isCorrect = true;
        for(int i = 0; i<peopleNumber;i++){
            if(trueNumbers[i] != targetNumbers[i]){
                isCorrect = false;
                break;
            }
        }
        long mod = (long)(Math.pow(10, 9) + 7);
        if(isCorrect) {
            if (peopleNumber % 2 == 0) {
                long answer = (long)(Math.pow(2, peopleNumber / 2));
                System.out.println(answer%mod);
            } else {
                long answer = (long)(Math.pow(2, (peopleNumber - 1) / 2));
                System.out.println(answer%mod);
            }
        }else{
            System.out.println(0);
        }
    }
}
