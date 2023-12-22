import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long L;
        long R;
        long[][] xList;
        try (Scanner sc = new Scanner(System.in)) {
            L = sc.nextLong();
            R = sc.nextLong();
        }

        if((R - L) > 2019 ){
            System.out.println(0);
            return;
        }

        long temp = 2019;
        for(long j=L;j < R;j++){
            for(long i = j+1;i < R+1;i++){
                long k = (j* i)%2019;
                if(temp > k){
                    temp = k;
                }
                //debug("k,j,i"+k+":"+j+":"+i);
                if(temp == 0){
                    break;
                }

            }
        }
        System.out.println(temp);
    }


}
