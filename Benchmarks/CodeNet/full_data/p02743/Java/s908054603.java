import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
public static String solve(int a,int b,int c)
{
    if(a>=c|| b>=c) return "No";
    if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c))
        return "Yes";
    else return "No";
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
       
        System.out.print(solve(a,b,c));
        
     
        
    }

}
