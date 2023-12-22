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
        int max = Math.max(Math.max(a[0], a[1]), a[2]);
        int el1 = Math.min(Math.min(a[0], a[1]), a[2]);
        int el2 = a[0] + a[1] + a[2] - max - el1;
        int ans;
        if(a[0] % 2 == a[1] % 2 && a[1] % 2 == a[2] % 2)
            ans = (max * 3 - a[0] - a[1] - a[2]) / 2;
        else{
            if((max - el1) % 2 == (max - el2) % 2)
                ans = (2 * max - el1 - el2) / 2;
            else{
                ans = (max - el1 + 1) / 2 + (max - el2 + 1) / 2 + 1;
            }
        }
        System.out.println(ans);
    }
}