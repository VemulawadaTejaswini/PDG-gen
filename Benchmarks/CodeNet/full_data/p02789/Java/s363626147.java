import java.util.Scanner;

class Answer
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        if (n==m)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
