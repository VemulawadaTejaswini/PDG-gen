import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];

        for(int i=0; i<N ;i++){
            nums[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i=-100;i<=100;i++){
            int sumSquare = 0;
            for(int j=0;j<N;j++){
                sumSquare +=  (nums[j] - i) * (nums[j] - i);
            }

            if(sumSquare < min){
                min = sumSquare;
            }
        }

        System.out.println(min);
    }
}