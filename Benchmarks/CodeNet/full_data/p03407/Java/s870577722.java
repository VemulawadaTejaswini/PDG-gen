import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        s=reader.readLine();

        String[] inp = s.split(" ");

        int a,b,c;

        a=Integer.parseInt(inp[0]);
        b=Integer.parseInt(inp[1]);
        c=Integer.parseInt(inp[2]);

        if(a+b>=c)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
