import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D =sc.nextInt();
        int sum_price =0;
        if(A>=B) sum_price += B;
        else sum_price +=A;
        if(C>=D) sum_price+=D;
        else sum_price+=C;

        System.out.println(sum_price);
         }
}