import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] c=sc.next().toCharArray();
        int ans=0;
        for(int i=0;i+3<n;++i){
            if(c[i]=='A'&&c[i+1]=='B'&&c[i+2]=='C')++ans;
        }
        System.out.println(ans);
    }
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
