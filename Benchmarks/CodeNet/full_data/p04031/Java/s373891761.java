import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long[] numList = new long[num];

        for(int i=0; i<num; i++) {
            numList[i] = Integer.valueOf(scan.next());
        }

        int sum = 0;
        for(int i=0; i<num; i++) {
            sum += numList[i];
        }
        sum = sum/num;

        int result = 0;
        for(int i=0; i<num; i++) {
            result += (sum-numList[i])*(sum-numList[i]);
        }

        System.out.println(result);


    }
}
