import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];

        int sum = 0;
        int bn = 1;
        
        for(int i = 0; i<N; i++){
            L[i]= sc.nextInt();   

            sum += L[i];
            if(sum >= X){
                bn++;
                break;
            }
            bn++;       
        }

        System.out.println(bn);

    }
}
