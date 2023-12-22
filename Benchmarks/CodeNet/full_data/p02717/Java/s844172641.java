import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();
        int X=A;
        A=B;
        B=X;
        X=A;
        A=C;
        C=X;
        
        System.out.println(A+" "+B+" "+C);
    }
}