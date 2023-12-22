//package Hello.World;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String words[]={"red","pink"};
        if(n<=3200)
            out.println(str);
        else{
            if(str.equals(words[0]))
                out.println("pink");
            else
                out.println("red");
        }

        out.flush();
    }

}
