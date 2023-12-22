import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums  = new int[n];
        int x; 
        for (int i = 0; i < n-1; i++) {
           x = sc.nextInt();
           nums[x-1]++;
        }
        for (int i=0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}
