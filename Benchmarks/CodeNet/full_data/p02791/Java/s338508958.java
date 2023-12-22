import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        int max = nums[nums.length -1];
        int counter = 0;
        for (int i = nums.length - 1; 0<= i ; i--) {
            if(nums[i] < max){
                counter++;
            }
            max = nums[i];
        }
        System.out.println(nums.length - counter);
    }
}