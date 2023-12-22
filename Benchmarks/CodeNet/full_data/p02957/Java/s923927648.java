import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int K = 0;

        int C = A-B;
        int D = B-A;

        if(C < 0){
            C = -1*C; 
        }else{
            D = -1*D;
        }


        if(A == 0 || B == 0){
            System.out.println("IMPOSSIBLE");
        }
        else if(C < 2 || D < 2){
            System.out.println("IMPOSSIBLE");
        }
        else{
            K = (A+B)/2;
            System.out.println(K);
        }

    }
}