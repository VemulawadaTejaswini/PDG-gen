package com.company;
import  java.util.*;
import java.util.Collections;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        long ar[] = new long[a];
        int i, j = 0;
        for (i = 0; i < a; i++) {
            ar[i] = sc.nextLong();
        }
        if(b>=a){
            System.out.println(a);
        }
        else {

            sort(ar);
        /*for(j=a-1;j>=0;j--)
        {
            ar[j]=0;
        }*/
            long sum = 0;
            for (i = 0; i <a - b; i++) {
                sum = sum + ar[i];
            }
            long m = sum ;
            System.out.println(m);
        }
    }
}
