import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] nums = new Num[n];
        for (int i = 0; i < n; i++) {
            nums[i] = new Num(i, sc.nextInt());
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != nums[i].idx % 2) {
                count++;
            }
        }
        System.out.println(count / 2);
    }
    
    static class Num implements Comparable<Num> {
        int idx;
        int value;
        
        public Num(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
        
        public int compareTo(Num another) {
            return value - another.value;
        }
    }
}