import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] c = new long[200];
        int[] result = new int[200];
        int sum = 0;
        int num = 1;
        while(N!=0) {
            long pos = 0x0000000000000001L;
            int posi = 63;
            String s = "";
            while (pos != 0) {
                if ((N & pos) == 0) {
                    s += "0";
                } else {
                    s += "1";
                }
                pos = pos << 1;
            }
            int i = s.lastIndexOf("1") + 1;
            int j = s.lastIndexOf("0", i - 1) + 1;
            int x = j;
            int y = i - j;
            if (x < y) {
                y = i / 2;
                x = i - y;
            }
            for(int a=0;a<x;a++){
                for(int b=0;b<y;b++){
                    result[sum]=num+b;
                    sum++;
                }
            }
            num+=y;

            N-=(Math.pow(2,x)-1)*(Math.pow(2,y)-1);
            if(N==1){
                break;
            }
        }
        result[sum]=num+1;
        sum++;
        result[sum]=num+1;
        sum++;

        System.out.println(sum);
        for(int i=0;i<sum;i++){
            System.out.print(result[i]+" ");
        }

    }
}