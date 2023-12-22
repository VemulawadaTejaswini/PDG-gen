import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int max = Math.max(Math.max(a[0], a[1]) , a[2]);
        int ans = 0;
        for(int i = 0; i < 3; i++){
            ans += (max - a[i]) / 2;
            if((max - a[i])  % 2 == 1)
            {
                if(max - a[i] == 1  || max - a[i] == 3) ans += 1;
                else ans += 2;
            }
        }
        System.out.println(ans);
    }
}
