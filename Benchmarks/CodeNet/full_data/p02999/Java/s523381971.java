import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String argvs[])
    {
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] strLine = in.readLine().split(" ");
            System.out.println(solve(Integer.parseInt(strLine[0]),Integer.parseInt(strLine[1])));

        }catch(IOException e)
            {
                System.out.println(e);
                System.exit(0);
            }
    }
    private static int solve(int X,int A)
    {
        if(X<A)
            return 0;
        else
            return 10;

    }
}
