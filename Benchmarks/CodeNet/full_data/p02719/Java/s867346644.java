import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        n = n%k;
        System.out.println(Math.min(n,Math.abs(k-n)));
    }
        
    public static int[] sort(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            x = a[i];
            for(int j=0;j<a.length;j++){
                if(x == Math.max(x,a[j])){
                    a[i]=a[j];
                    a[j]=x;
                    x=a[i];
                }
            }
        }
        return a;
    }
}