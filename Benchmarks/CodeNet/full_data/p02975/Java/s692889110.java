import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nums[i]=sc.nextInt();
            s.add(nums[i]);
        }

        if(s.size()!=3){
            System.out.println("No");
            return;
        }

        if(s.size()%3 != 0 ){
            System.out.println("No");
            return;
        }


        System.out.println("Yes");

    }
}
