import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//敵の数
        int A = scan.nextInt();//Aダメージ
        int B = scan.nextInt();//Bダメージ
        int C = A-B;//差分
        long E[] = new long[N];//各個体のHP
        long l = 0;//殴る回数（最小）
        long r = 1000000001;//殴る回数（最大）
        long m = 500000000;
        int x;

        for(int i = 0;i<N;i++){
            E[i] = scan.nextInt();//各個体のHPを入力
        }


        while(l < r-1){
            long Ex[] = new long[N];
            long d =0;
            int flag = 0;
            m = (l+r)/2;

            for(int i = 0;i<N;i++){
                Ex[i] = E[i] - B*m;
                if(Ex[i]>0){
                    if(Ex[i] % C == 0){
                        d += Ex[i]/C;
                    }else {
                        d += Ex[i] / C + 1;
                    }
                }
            }

            if(d>m) {flag = 1;}

            if(flag == 1) {
                l = m;
            }
            else{
                r = m;
            }
        }
        System.out.println(r);
    }
}
