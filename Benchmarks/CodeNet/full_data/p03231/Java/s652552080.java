import java.util.*;

import javax.print.attribute.HashAttributeSet;
 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next(), t = sc.next();

        int l = calc(n, m);
        int x = l / m;
        int y = l / n;

        boolean bl = true;
        for(int i = 0; i < s.length(); i += x){
            if(s.charAt(i) != t.charAt((int)i * y / x)){
                System.out.println(-1);
                bl = false;
                break;
            }
        } 
        if(bl)
            System.out.println(l);

    }
    static int calc (int n, int m)
    {
        int x = Math.min(n, m);
        int y = Math.max(n, m);
        for(int i = 1; i < x;i++)
        {
            if(y * i % x == 0){
                return y * i;
            }
        }
        return y * x;
    }
 }