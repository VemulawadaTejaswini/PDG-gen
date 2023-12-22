import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long sum=a[0];
        int t=0;
        for(int i=1;i<n;i++){
            if(sum*2>=a[i]) {
                sum += a[i];
                continue;
            }
            t=i;
            break;
        }
        System.out.println(n-t);
    }
}