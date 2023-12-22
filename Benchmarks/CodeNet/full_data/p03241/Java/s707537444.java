import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = 0;

        for(int i = n; i <= m; i++){
            if( m % i == 0){
                ans = m / i;
                break;
            }
        }
        System.out.println(ans);

    }
}
