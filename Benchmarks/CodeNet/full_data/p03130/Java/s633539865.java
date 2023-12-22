import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3], b = new int[3];
        int[] cnt = new int[4];
        for(int i = 0; i < 3; i++){
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            cnt[a[i]]++;
            cnt[b[i]]++;
        }
        String ans = "NO";
        int x = 0, y = 0;
        for(int i = 0; i < 4; i++){
            if(cnt[i]==2) x++;
            if(cnt[i]==1) y++;
        }
        if(x == 2 && y == 2) ans = "YES";
        System.out.println(ans);
    }
}