import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[32];
        int cnt = -1;
        while(n != 0){
            s[++cnt] = Math.abs(n) % 2;
            n = (n - s[cnt]) / (-2);
        }
        for(int i = cnt; i >= 0; i--){
            System.out.print(s[i]);
        }
    }
}


