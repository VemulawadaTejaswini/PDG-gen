import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM  = scan.nextInt();
        long[] nums = new long[NUM];
        for(int i = 0; i < NUM; i++){
            nums[i] = scan.nextLong();
        }

        // search
        long sum = 0;
        for(int i = 0; i < NUM - 1; i++){
            for(int j = i + 1; j < NUM; j++){
                sum += (nums[i] ^ nums[j]) % 1000000007;
            }
            
        }

        // answer
        System.out.println(sum % 1000000007);

    }
}