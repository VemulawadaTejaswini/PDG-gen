import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Long> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            boolean bool = true;
            for (long item : list) {
                if(item < num){
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
            }
            list.add(num);
        }
        System.out.println(count);
    }
}
