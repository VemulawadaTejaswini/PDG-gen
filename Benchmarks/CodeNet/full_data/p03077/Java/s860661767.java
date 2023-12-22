import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long E = sc.nextLong();
        long[] Number = new long[6];
        Number[0] = N;
        long count = 0;
        sc.close();

        while(Number[5] < N){
            if(Number[4] > 0){
                if(Number[4] >= E){
                    Number[4] -= E;
                    Number[5] += E;
                } else{
                    Number[5] += Number[4];
                    Number[4] = 0;
                }       
            }
            if(Number[3] > 0){
                if(Number[3] >= D){
                    Number[3] -= D;
                    Number[4] += D;
                } else {
                    Number[4] += Number[3];
                    Number[3] = 0;
                }
            }
            if(Number[2] > 0){
                if(Number[2] >= C){
                    Number[2] -= C;
                    Number[3] += C;
                } else {
                    Number[3] += Number[2];
                    Number[2] = 0;
                }
            }
            if(Number[1] > 0){
                if(Number[1] >= B){
                    Number[1] -= B;
                    Number[2] += B;
                } else {
                    Number[2] += Number[1];
                    Number[1] = 0;
                }
            }
            if(Number[0] > 0){
                if(Number[0] >= A) {
                    Number[0] -= A;
                    Number[1] += A;
                } else {
                    Number[1] += Number[0];
                    Number[0] = 0;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
