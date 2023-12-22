import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void scanArray(Scanner sc, int[] array, int num) {
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
    }

    //最小公倍数
    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }
    //最大公約数
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)b;
    }

    public static void main(String[] args) {

        int N;
        int K;
        int[] dList;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
            dList = new int[K];
            for (int i = 0; i < K; i++) {
                dList[i] = sc.nextInt();
            }
        }
        String strN = String.valueOf(N);
        int[] map = getMapper(dList);
        int base =1;
        int result = 0;
        while(true){
            int n = N%10;
            result += (map[n]*base);
            if(N<10){
                break;
            }
            N = N/10;
            if(map[n] < n){
                //繰り上がり
                N +=1;
            }
            base *=10;
        }
        System.out.println(result);


    }

    static private int[] getMapper(int[] dList){
        int[] result = new int[10];
        for(int i = 0;i < result.length;i++){
            result[i] = i;
        }
        for(int i = 0;i < dList.length;i++){
            int x = dList[i];
            result[x] = -1;
        }
        for(int i = 0; i < result.length;i++){
            int x = result[i];
            if(x != -1){
                continue;
            }
            for(int j = i+1;j%10 != i;j++){
                int temp = j;
                if(temp >= 10){
                    temp = temp -10;
                }
                if(result[temp] != -1){
                    result[i] = result[temp];
                    break;
                }
            }
        }
        return result;

    }

}
