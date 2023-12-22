import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> nums = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            nums.add(sc.nextInt());
        }
        int r = 0;
        for(int i = 1;i < n - 1;i++){
            int p1 = nums.get(i - 1);
            int p2 = nums.get(i);
            int p3 = nums.get(i + 1);
            if(p1 > p2 && p2 > p3){
                r++;
            }else if(p3 > p2 && p2 > p1){
                r++;
            }
        }
        System.out.println(r);
    }
}