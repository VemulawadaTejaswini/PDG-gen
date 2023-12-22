import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];

        List<Long> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                list.add((long)nums[i] * nums[j]);
            }
        }

        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(k-1));



    }
}
