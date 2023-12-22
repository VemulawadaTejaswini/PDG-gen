import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        boolean han = true;
        
        for(int i = 0; i < N; i++) {
            int s = sc.nextInt();
            if(map.containsKey(s)) {
                han = false;
                break;
            }else {
                map.put(s, 1);
            }
        }
        
        if(han) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
    }
}
