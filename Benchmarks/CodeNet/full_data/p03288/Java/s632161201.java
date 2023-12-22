import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        if (t < 1200) System.out.println("ABC");
        else if (t < 2800) System.out.println("ARC");
        else System.out.println("AGC");     
     }
}