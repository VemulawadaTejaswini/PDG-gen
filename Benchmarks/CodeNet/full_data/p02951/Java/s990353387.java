import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String nums[] = line.split(" ");
        int A = Integer.parseInt(nums[0]);
        int B = Integer.parseInt(nums[1]);
        int C = Integer.parseInt(nums[2]);
        int amount = C - (A - B);
        if (amount < 0) {
          amount = 0;
        }
        System.out.println(amount);
    }
}