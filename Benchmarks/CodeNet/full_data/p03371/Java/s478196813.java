import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        String[] sl = s.split("[\\s]+");
        int a = Integer.parseInt(sl[0]);
        int b = Integer.parseInt(sl[1]);
        int ab = Integer.parseInt(sl[2]);
        int x = Integer.parseInt(sl[3]);
        int y = Integer.parseInt(sl[4]);
        
        int apb = Math.min(a + b, 2 * ab);
        int sum = 0;
        int v = Math.min(x, y);
        sum += v * apb;
        x -= v;
        y -= v;
        if(x == 0)
        {
            sum += Math.min(y * b, 2 * y * ab);
        }
        else
        {
            sum += Math.min(x * a, 2 * x * ab);
        }
        System.out.println(sum);
    }
    
}
