import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class Main{
    public static void main(String []args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.printf("%0.10f%n",a/b);


    }
}
