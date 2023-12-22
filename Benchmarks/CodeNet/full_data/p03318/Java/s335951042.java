import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sr = new Scanner(System.in);
            String inputLine = sr.nextLine();
            Long K = Long.valueOf(inputLine);
            int count = 0;
            long n = 1;
            while (count != K) {
                if (n > 1000000000000000.0){
                    break;
                }
                boolean sunukeCheckFlag = true;
                for (Long m =n+1; m <=100000; m++){
                    if (nPerSn(n) <= nPerSn(m)){
                        continue;
                    }else{
                        sunukeCheckFlag = false;
                        break;
                    }
                }
                if (sunukeCheckFlag){
                    System.out.println(n);
                    count++;
                    n++;
                }else {
                    n++;
                }
            }
        }
        public static double nPerSn(Long num){

            double Sn = 0;
            Long cNum = num;
            while (cNum != 0){
                Sn += (cNum % 10);
                cNum /= 10;
            }
            return num / Sn;
        }
}
