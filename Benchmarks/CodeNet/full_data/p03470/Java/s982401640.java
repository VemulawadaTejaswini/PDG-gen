import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] d = new int[N];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            int a = scan.nextInt();
            set.add(a);
        }
        System.out.println(set.size());
    }
}
