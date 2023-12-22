import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c))
            System.out.print("Yes");
        else System.out.print("No");
        
    }

}
