import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        BigInteger M = new BigInteger(new Integer(sc.nextInt()).toString());

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        sc.close();

        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                if(A[j] > A[j+1]){
                    int tmpA = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmpA;

                    int tmpB = B[j];
                    B[j] = B[j+1];
                    B[j+1] = tmpB;
                }
            }
        }

        BigInteger count = new BigInteger("0");
        BigInteger value = new BigInteger("0");

        for(int i=0; i<N; i++){
            if(count.add(new BigInteger(new Integer(B[i]).toString())).compareTo(M) <= 0){
                count = count.add(new BigInteger(new Integer(B[i]).toString()));
                value = value.add(new BigInteger(new Integer(A[i]).toString()).multiply(new BigInteger(new Integer(B[i]).toString())));
                if(count.compareTo(M) >= 0){
                    break;
                }
            }else{
                value = value.add(new BigInteger(new Integer(A[i]).toString()).multiply(M.subtract(count)));
                break;
            }
        }

        System.out.println(value);

    }
}
