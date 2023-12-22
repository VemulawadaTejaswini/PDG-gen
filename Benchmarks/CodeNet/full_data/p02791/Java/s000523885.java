import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            boolean bool = true;
            long base = list.get(j);
            for (int k = 0; k < j; k++) {
                if(list.get(k) < base){
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
            }
        }
        System.out.println(count);
    }
}
