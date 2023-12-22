import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        char[] str = io.next().toCharArray();
        int c = 0;
        for(int i = 0; i < n-2; i++)
            if(str[i] == 'A' && str[i+1] == 'B' && str[i+2] == 'C' && (i += 2) > 0) c++;
        System.out.println(c);
    }
}
