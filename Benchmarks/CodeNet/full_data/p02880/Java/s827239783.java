import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>(36);
        for (int i = 1; i < 10; i++){
            for (int j = i; j < 10; j++){
                nums.add(i*j);
            }
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            if (nums.contains(in.nextInt())){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
