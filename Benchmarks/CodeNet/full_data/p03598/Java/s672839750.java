import java.util.Scanner;

public class Main
{
    int n, k;
    int[] x;
    int ans;
    
    public static void main(String args[])
    {
	new Main().run();
    }
    
    void run()
    {
	in();

	for(int i = 0; i < n; i++) {
	    int a = x[i];
	    int b = Math.abs(x[i] - k);
	    if(a < b) ans += a * 2;
	    else      ans += b * 2;
	}
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	k = sc.nextInt();
	x = new int[n];
	for(int i = 0; i < n; i++) x[i] = sc.nextInt();
    }

    void out()
    {
	System.out.println(ans);
    }
}
