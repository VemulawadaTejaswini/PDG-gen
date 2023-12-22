import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, (a, b) -> {
            if(a % 10 == 0) 
                return -1;
            else if(b % 10 == 0)
                return 1;
            return b % 10 - a % 10;
        });
        int cnt = 0;
        for(int i = 0; i < arr.size(); i++) {
            
            int a = arr.get(i);
            if(a % 10 == 0 || i == arr.size() - 1)
                cnt += a;
            else
             cnt += ((a / 10) + 1) * 10;
        }
        System.out.println(cnt);
    }
}
