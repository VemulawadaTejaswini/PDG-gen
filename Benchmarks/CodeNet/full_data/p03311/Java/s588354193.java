import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i)a[i]=scan.nextInt()-(1+i);
        Arrays.sort(a);
        int b = a[n/2];
        long res = 0;
        for(int i=0;i<n;++i)res+=Math.abs((long)a[i]-(long)b);
        System.out.println(res);
    }
}