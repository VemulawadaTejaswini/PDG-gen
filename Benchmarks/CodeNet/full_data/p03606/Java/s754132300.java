import java.util.Scanner;

public class Main
{
    int n;
    int l, r;
    int ans = 0;
    
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

	n = sc.nextInt();
	for(int i = 0; i < n; i++) {
	    l = sc.nextInt();
	    r = sc.nextInt();
	    ans += r - l + 1;
	}
    }

    void out()
    {
	System.out.println(ans);
    }
}
