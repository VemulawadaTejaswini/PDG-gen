import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = (long)Integer.parseInt(sc.next());
        long B = (long)Integer.parseInt(sc.next());
        long C = A * B;
        if(B > A){
            long tmp = B;
            B = A;
            A = tmp;
        }
        long tmp2 = 0;
        while((tmp2 = A % B) != 0){
            A = B;
            B = tmp2;
        }
        long ans = C / B;
        System.out.println(ans); 
    }

}