import java.util.*;

public class Main {
    static int generateGCD(int a, int b) {
        if(a % b == 0) {
            return b;
        } else {
            return generateGCD(b, a % b);
        }
    }
    
    static int generateLCM(int[] numbers) {
        int currentLCM = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            int tempGCD = generateGCD(numbers[i], numbers[i+1]);
            currentLCM = numbers[i] * numbers[i+1] / tempGCD;
        }
        return currentLCM;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = (in.nextInt())/2;
        }
        int k = generateLCM(numbers);
        double ans = m/((double)2*k);
        if(ans < 1) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.ceil(ans));
        }
    }
}
