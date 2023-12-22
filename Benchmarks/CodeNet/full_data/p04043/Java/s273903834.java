import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void Solver(int A,int B,int C)
    {
        int sevenCount = 0;
        int fiveCount = 0;
        if(A == 5)
            fiveCount++;
        if(B == 5)
            fiveCount++;
        if(C == 5)
            fiveCount++;
        if(A == 7)
            sevenCount++;
        if(B == 7)
            sevenCount++;
        if(C == 7)
            sevenCount++;

        if(fiveCount == 2 && sevenCount == 1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Solver(input.nextInt(),input.nextInt(),input.nextInt());
    }
}
