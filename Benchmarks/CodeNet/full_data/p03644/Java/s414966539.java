import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

    public static void main (String [] args){
        Scanner  sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer [] R = new Integer[N];
        double rate =0;
        for (int i= 0;i<N;i++){
            R[i]= sc.nextInt();
        }
        Arrays.sort(R, Comparator.reverseOrder());
        for (int i =K-1; i >= 0;i--){
            rate = (rate + R[i])/2;
        }
        System.out.println(rate);

    }
}