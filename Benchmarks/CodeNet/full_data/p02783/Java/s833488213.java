import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int i= 0;

        while (true) {
            H = H - A;
            i++;
            if(H < 0)break;
        }

        System.out.println(i);

    }
}