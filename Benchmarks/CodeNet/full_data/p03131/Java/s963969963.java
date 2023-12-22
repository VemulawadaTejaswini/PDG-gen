import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long K = in.nextLong();
            long A = in.nextLong();
            long B = in.nextLong();
            long biscuits = K + 1;
            if( K - 1 < A || A >= B){
                System.out.println(biscuits);
            }else{
                long N = (K + 1 - A) / 2;
                biscuits = A + (B - A) * N + ((K + 1 - A) % 2);
                System.out.println(biscuits);
            }
        }
    }
}