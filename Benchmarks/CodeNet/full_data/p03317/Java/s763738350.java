import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
 
 
class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        int count = 0;
        int a=0,b= 0;
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        a = n;
        b = k;
            if(n == k){
                ans = 1;
            }else{
                ans = (n-k)/ (k -1)+ 2;
            }
        
        System.out.println(ans);
        scanner.close();
    }
}