import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int A,B,K;
        A=sc.nextInt();
        B=sc.nextInt();
        K=sc.nextInt();
        for(int a=A;a<A+K;a++){
            System.out.println(a);
        }
        for(int a=B-K+1;a<=B;a++){
            System.out.println(a);
        }
    }
}