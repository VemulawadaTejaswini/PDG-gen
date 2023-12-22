import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

//    static long[][] dp;

    static TreeMap<String,Long> ddp = new TreeMap<>();

    static long max(long a, long b){
        if(a > b)
            return a;
        return b;
    }

    static long calculate(int[][] arr, int pos, int currentWeigth){
        String data = pos+"_"+currentWeigth;
        if(pos >= arr.length)
            return 0;
        if(arr[pos][0] <= currentWeigth){
            if(ddp.containsKey(data))
                return ddp.get(data);
            ddp.put(data, max(arr[pos][1]+calculate(arr,pos+1,currentWeigth-arr[pos][0]),
                    calculate(arr,pos+1,currentWeigth)));
            return ddp.get(data);
        }
        else{
            ddp.put(data,calculate(arr,pos+1,currentWeigth));
            return ddp.get(data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

//        dp = new long[n][w+1];

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < w+1 ; j++){
//                dp[i][j] = -1;
//            }
//        }

        System.out.println(calculate(arr,0,w));
    }
}
class Data{
    int size,weight;
}