import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] odd = new long[n - n/2];
        long[] even = new long[n/2];
        long[] nums = new long[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int oddIndex = 0;
        int evenIndex = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                odd[oddIndex] = nums[i];
                oddIndex++;
            } else {
                even[evenIndex] = nums[i];
                evenIndex++;
            }
        }
        long[] newNums = new long[n];
        int middle = n - n/2;
        long count = 0;
        int evenStart = 0;
        int evenEnd = even.length-1;
        for(int i = middle; i < n; i++) {
            if(count % 2 == 0) {
                newNums[i] = even[evenEnd];
                evenEnd--;
            } else {
                newNums[i] = even[evenStart];
                evenStart++;
            }
            count++;
        }
        count = 0;
        int oddStart = 0;
        int oddEnd = odd.length-1;
        for(int i = middle-1; i >= 0; i--) {
            if(count % 2 == 0) {
                newNums[i] = odd[oddStart];
                oddStart++;
            } else {
                newNums[i] = odd[oddEnd];
                oddEnd--;
            }
            count++;
        }
        long sum = 0;
        long prev = newNums[0];
        for(int i = 1; i < n; i++) {
            long current = newNums[i];
            sum += Math.abs(prev - current);
            prev = current;
        }
        System.out.println(sum);
    }
}

