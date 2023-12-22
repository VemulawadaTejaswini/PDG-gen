import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double psum =0;
        for(int i = 0; i< N; i++){
            double p_i = 1;
            int point = i+1;
            while(point < K){
                point *= 2;
                p_i *= 0.5;
            }
            psum += p_i;
        }
        psum /= N;
        System.out.println(psum);
    }
}

