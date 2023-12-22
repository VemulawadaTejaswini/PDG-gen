import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println((1 & a & b) == 0 ? "Even" : "Odd");
    }
}