
import java.util.*;

import static java.lang.System.*;

public class Main {
    static int maxBitNum = 50;
    static int[] bitArray = new int[maxBitNum];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        fFunction(A, B);

        StringBuilder stringReverseBitArray = new StringBuilder();
        for(int i = maxBitNum-1; i >= 0; i--){
            stringReverseBitArray.append(bitArray[i]);
        }

        long ans = Long.parseLong(stringReverseBitArray.toString(), 2);
        out.println(ans);
    }

    public static void fFunction(long A, long B) {
        if(A == 0){ A = 1; }
        if(A > B){ return; }

        // 最大値の含まれるビットを探す
        int bitNum = searchMaxBit(B);

        // そのビットに含まれる整数の数を数える
        long numPowBitNum = (long)Math.pow(2.0, (double)bitNum);
        long num;
        if(numPowBitNum < A){
            num = B - A + 1;
        } else {
            num = B - numPowBitNum + 1;
        }

        // 奇数個だったら、そのビットを変える(すでに1だったら0に戻す)
        if(num % 2 == 1){
            bitArray[bitNum] = Math.abs(bitArray[bitNum] - 1);
        }

        // そのビット以外のところも操作する
        fFunction(A, numPowBitNum - 1);

        if(A < numPowBitNum) {
            fFunction(0, B - numPowBitNum);
        } else {
            fFunction(A - numPowBitNum, B - numPowBitNum);
        }

    }

    // 2^t <= x < 2^(t+1)となるtを返す
    public static int searchMaxBit(long x){
        int t = 1;
        while(Math.pow(2.0, (double)t) <= x){
            t++;
        }
        return t-1;
    }
}
