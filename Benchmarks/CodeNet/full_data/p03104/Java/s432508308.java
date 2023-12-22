import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int opt = A;
        for(int a =A+1;a<=B;a++) opt = opt^a;
        System.out.println(opt);

    }
}