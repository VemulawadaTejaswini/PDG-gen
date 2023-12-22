import java.util.Scanner;

public class Main
{
    String str;
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();

	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	str = sc.next();
    }

    void out()
    {
	System.out.println(str.substring(0, 1)
			   + (str.length() - 2)
			   + str.charAt(str.length() - 1));
    }
}
