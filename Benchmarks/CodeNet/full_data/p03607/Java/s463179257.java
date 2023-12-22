import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i = 0; i < n; i++) {
            long curr = sc.nextLong();
            if(list.contains(curr)) {
                list.remove(curr);
            } else {
                list.add(curr);
            }
        }
        System.out.println(list.size());
    }
}