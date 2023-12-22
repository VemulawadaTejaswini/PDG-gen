import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i)a[i]=scan.nextInt();
        Arrays.sort(a);
        int max = a[n-1];
        int r = 0;
        for(int i=0;i<n;++i){
            int aa = Math.min(a[i], max-a[i]);
            if(r<aa)r=a[i];
        }
        System.out.println(max+" "+r);
    }
}