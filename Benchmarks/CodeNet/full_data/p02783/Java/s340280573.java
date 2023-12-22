

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        int i,j,k=0;
        Scanner sc =new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        while (i >= 0)
        {
            i=i-j;
            k++;
        }
        System.out.println(k);
    }
}