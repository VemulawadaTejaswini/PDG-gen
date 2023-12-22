import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i]=sc.nextInt();
        }
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);

        int diff=0;
        for (int i = 0; i < N; i++) {
            if(nums2[i]!=nums[i]){
                diff++;
            }
        }
        if(diff<=2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
