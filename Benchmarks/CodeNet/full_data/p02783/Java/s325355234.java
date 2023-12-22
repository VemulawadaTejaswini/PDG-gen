

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        long i,j,k=0;
        Scanner sc =new Scanner(System.in);
        i=sc.nextLong();
        j=sc.nextLong();
        k=i/j;
        k=Math.ceil(k);
        System.out.println(k);
    }
}