import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong() - 1;
        int[] nums = new int[n];

        TreeMap<Long,Long> map = new TreeMap<>();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                long ans = ((long) nums[i] * nums[j]);
                if(map.containsKey(ans)){
                    map.put(ans, map.get(ans) + 1);
                } else {
                    map.put(ans, 1L);
                }
            }
        }


//        for(Map.Entry<Long,Long> entry: map.entrySet()){
//            System.out.println(entry);
//        }

        for(Map.Entry<Long,Long> entry: map.entrySet()){
            k = k - entry.getValue();

            if(k < 0){
                System.out.println(entry.getKey());
                return;
            }


        }

    }
}
