import java.util.*;

public class Main {
    public static void main(String[] args) {
        int ans=0;
        int bool = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> nums = new LinkedList<>();
        for(int i=0;i<n;i++){
            nums.add(sc.nextInt());
        }
        nums.sort(Collections.reverseOrder());
        for (int num:nums){
            ans += num*bool;
            bool=(-bool);
        }
        System.out.println(ans);
    }
}