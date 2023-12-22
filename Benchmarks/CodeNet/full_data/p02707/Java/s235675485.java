import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n-1;i++){
            int b=scan.nextInt();
            a[b]++;
        }
        for(int i=1;i<=n;i++){
            System.out.println(a[i]);
        }
    }
}