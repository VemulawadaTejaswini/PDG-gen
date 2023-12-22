import java.util.Scanner;

public class Main
{

    public void run( )
    {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for ( int i = 0; i < n; i++ )
        {
            arr[i] = sc.nextInt() - (i + 1);
        }
        double ave = 0;
        for ( int i = 0; i < n; i++ )
        {
            ave += 1.0 * arr[i] / n;
        }
        int floor = (int) Math.floor( ave );
        int ceil = (int) Math.ceil( ave );
        int ans1 = 0;
        int ans2 = 0;
        for ( int i = 0; i < n; i++ )
        {
            ans1 += Math.abs( arr[i] - floor );
            ans2 += Math.abs( arr[i] - ceil );
        }
        System.out.println( Math.min( ans1, ans2 ));
    }

    public static void main( String[] args )
    {
        new Main( ).run( );
    }
}