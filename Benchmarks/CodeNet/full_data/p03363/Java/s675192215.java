import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = readInt();
        int[] nums = new int[N];
        int[] acc = new int[N+1];

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        for(int i=0; i<N; i++){
            nums[i] = readInt();
            acc[i+1] += acc[i] + nums[i];

            if(mp.containsKey(acc[i+1])){
                int tmp = mp.get(acc[i+1]);
                tmp += 1;
                mp.put(acc[i+1], tmp);
            }else{
                mp.put(acc[i+1], 1);
            }
        }

        long cnt = 0;

        for(int key: mp.keySet()){
            int tmpCnt = mp.get(key);
            cnt += Comb(tmpCnt);
        }

        System.out.println(cnt);
    }

    private static long Comb(int tmpCnt) {
        if(tmpCnt == 1){
            return 0;
        }else{
            return tmpCnt * (tmpCnt - 1) / 2;
        }
    }

    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}