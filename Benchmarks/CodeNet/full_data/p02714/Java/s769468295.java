

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
        int sum = 'R'+'G'+'B';
//        int[] c_int = new int[c.length];
//        for(int i = 0; i < c.length; i++)
//        {
//            if(c[i]=='R')c_int[i] = 1;
//            else if(c[i]=='G')c_int[i] = 34;
//            else if(c[i]=='B')c_int[i] = 45;
//        }
        for(int i = 0; i < c.length; i++)
        {
            for(int j = i+1; j < c.length; j++)
            {
                if(c[i] != c[j]){
                    for(int k = j+1; k < c.length; k++)
                    {
                        if(j - i == k - j)continue;
                        if((c[i] + c[j] + c[k])== sum)ans++;
                    }
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
