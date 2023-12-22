import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int i=0, j=0, c=0;
        for(i=0; i<3; i++)
        a[i] = sc.nextInt();
        if(a[0] == a[1] && a[0]==a[2])
        System.out.println(1);
        else if (a[0] != a[1] && a[0]!=a[2] && a[1] != a[2])
        System.out.println(3);
        else
        System.out.println(2);
    }
}