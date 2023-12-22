import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = 0;
        int D = 0;

        C = (A+B)/2;
        D = (A+B)%2;

        if(D != 0){
            System.out.println("IMPOSSIBLE");
        }else{
            System.out.println(C);
        }


        

    }
}