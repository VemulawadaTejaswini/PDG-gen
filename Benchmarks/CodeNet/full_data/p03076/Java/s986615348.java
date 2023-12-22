import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int sum = 0;
        int slot = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int rem = arr[i] % 10;
            if (rem != 0) {
                if (rem < slot % 10) {
                    sum += (int) Math.ceil(slot / 10.0) * 10;
                    slot = arr[i];
                } else sum += (int) Math.ceil(arr[i] / 10.0) * 10;;
            } else {
                sum += arr[i];
            }
        }
        System.out.println(sum + slot);
    }
}