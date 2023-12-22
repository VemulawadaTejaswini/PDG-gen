package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a= in.nextLong();
        long b= in.nextLong();
        long k = in.nextInt();
        while (k-- !=0)
        {
            if(a%2!=0) {
                a = (a - 1) / 2;
                b=b+a;
            }
            else if(b%2!=0)
            {
                b=(b-1)/2;
                a+=b;
            }
            else
            {   if(b%2==0) {
                b = b / 2;
                a += b;
            }
            else
            {
                a=a/2;
                b+=a;
            }
            }

        }
        System.out.println(a+" "+b);
    }
}
