import java.util.*;

public class Main{
    public static void main(String[] args){
        new Main().A();
    }

    void A(){
        int N,M;

        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        M=sc.nextInt();

        String a=N == M ? "yes" : "no";

        System.out.println(a);
    }
}