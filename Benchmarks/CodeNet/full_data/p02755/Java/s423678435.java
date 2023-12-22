import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = (int) (A/0.08) + 1; i <= (int) ((A+1)/0.08); i++){
//            System.out.println(i);
            set.add(i);
        }

        for (int i = (int) (B/0.1); i <= (int) ((B+1)/0.1); i++){
//            System.out.println(i);
            if (set.contains(i)){
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println("-1");

    }
}