import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = A+(A-1);
        int D= A+B;
        int E= B+(B-1);
        int F=Math.max((Math.max(C, E)), D);
        System.out.println(F);
    }
}
