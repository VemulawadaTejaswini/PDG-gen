import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            long K = sc.nextLong();
            long count = 0;
            for (long m =1; m <=10e15; m*=10){
                boolean sunukeCheckFlag = true;
                for(int i = 1; sunukeCheckFlag; i++){
                    long x = i * m + m - 1;
                    long y = (i + 1) * m + m - 1;
                    if (nPerSn(x) <= nPerSn(y)){
                        System.out.println(x);
                        count ++;
                        if (count == K){
                            return ;
                        }
                    }else{
                        sunukeCheckFlag = false;
                    }
                }

            }
        }
        public static long nPerSn(Long num){

            long Sn = 0;
            Long cNum = num;
            while (cNum != 0){
                Sn += (cNum % 10);
                cNum /= 10;
            }
            return num / Sn;
        }
}
