import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long min = 0;

        if(C>=D){
            for(long i=1; i<=D; i++){
                if(C*i%D==0){
                    min = C * i;
                    break;
                }
            }
        }
        else{
            for(long i=1; i<=C; i++){
                if(D*i%C==0){
                    min = D * i;
                    break;
                }
            }
        }
        
        long x = min - (min / C + min / D - 1);
        System.out.println("min" + min + "x" + x);
        if(min!=0){
            System.out.println(B * x / min - A * x / min);
        }
        else{
            System.out.println(B - A + 1);
        }
    }
}
