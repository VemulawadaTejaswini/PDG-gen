import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Q[] =new int[3];
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = A+B;
        int E = A+C;
        int F = B+C;
        Q[0]=D;
        Q[1]=E;
        Q[2]=F;
        Arrays.sort(Q);
        System.out.println(Q[0]);
    }
}