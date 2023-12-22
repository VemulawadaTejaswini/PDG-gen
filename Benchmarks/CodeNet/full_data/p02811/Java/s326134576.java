import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Wandbox
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        long X=sc.nextLong();
        System.out.println((500*K>=X)?"Yes":"No");
    }
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
