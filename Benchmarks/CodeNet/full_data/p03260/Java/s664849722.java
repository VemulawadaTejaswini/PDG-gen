
import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String []args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        if(c%2==0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}