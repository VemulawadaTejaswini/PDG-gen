import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]),
            b = Integer.parseInt(line[1]),
            c = Integer.parseInt(line[2]);
        int max;
        if(a>b && a>c) max=a;
        else if(b>c) max=b;
        else max = c;
        
        if(max*2==a+b+c)System.out.println("Yes");
        else System.out.println("No");
    }
}