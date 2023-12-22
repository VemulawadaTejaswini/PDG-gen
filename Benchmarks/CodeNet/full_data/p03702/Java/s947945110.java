import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //入力受付
        int n = scan.nextInt();
        long a = scan.nextLong();
        long b = scan.nextLong();
        long h[] = new long [n];

        for(int i=0;i < n;i++){
            h[i]= scan.nextLong();
        }

        //二分探索
        long l = 0;
        long r = (long)Math.pow(10,9)+1;
        while(l < r-1){
            long m = (l+r)/2;
            long temp[] = new long[n];
            for(int i = 0;i < n;i++){
                temp[i] = h[i];
            }
            for(int i = 0;i < n; i++){
                temp[i] -= b*m;
            }
            long x = 0;
            for(int i = 0;i < n;i++){
                if(temp[i] > 0){
                    if(temp[i] % (a - b)==0){
                        x += temp[i] / (a-b);
                    }else{
                        x += (temp[i] / (a-b))+1;
                    }
                }
            }
            if(x <= m){
                r = m;
            }else{
                l = m;
            }
        }
        System.out.println(r);
    }
}
