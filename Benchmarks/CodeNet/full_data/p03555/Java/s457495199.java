
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        for(int i=0;i<a1.length();i++)
        {
            if(a1.charAt(i)!=a2.charAt(2-i))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}