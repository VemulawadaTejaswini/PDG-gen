import java.util.*;

public class Main {
    static int xC2(int x){
        int A;
        if(x>1)
            A= x*(x-1)/2;
        else
            A = 0;
        
        return A;
        }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int E = 0;
        E = xC2(N) + xC2(M);

        System.out.print(E);



    }
}