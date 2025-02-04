

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Main m = new Main();
        m.p4();
    }

    public void p4()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String input = scan.nextLine();
        char[] c = input.toCharArray();
        int ans = 0;
        char _i,_j,_k;
        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c.length; j++)
            {
                if(i > j)continue;
                for(int k = 0; k < c.length; k++)
                {
                    if(i > k || j > k )continue;
                    if(j - i == k - j)continue;
                    _i = c[i];
                    _j = c[j];
                    _k = c[k];
                    if(_i != _j && _j != _k && _i != _k)ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public void p3()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        int sum = 0;
        for(int i = 1; i <= input; i++)
        {
            for(int j = 1;j <= input; j++)
            {
                for(int k = 1; k <= input; k++)
                {
                    sum += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(sum);
    }
    private int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }

    public void p2()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        long sum = 0;
        for(int j = 0; j <= input; j++)
        {
            if(j % 3 != 0 && j % 5 != 0)sum += j;
        }
        System.out.println(sum);
    }

    public void p1()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.indexOf("7") != -1)System.out.println("Yes");
        else System.out.println("No");
    }
}
