import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        int[] array = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            map.put(array[i], sc.nextInt());
        }
        
        Arrays.sort(array);
        
        int cnt = n;
        
        for (int i = 0; i < n - 1; i++) {
            int now = array[i] + map.get(array[i]);
            int next = array[i+1];
            int nextArm = map.get(array[i+1]);
            if (!(now < next) || (next - nextArm < now)) {
                cnt--;
                i++;
            }
        }
        
        System.out.println(cnt);
    }
}
