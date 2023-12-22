import java.util.*;

public class ABC075A
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();

    if (A == B)
        System.out.println(C);
    else if (B == C)
        System.out.println(A);
    else
        System.out.println(B);
    }
}