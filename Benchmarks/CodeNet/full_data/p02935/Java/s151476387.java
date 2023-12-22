

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[] =new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        double ans=(double) (num[0]+num[1])/2;
        for(int i=2;i<n;i++){
            ans= (double) (ans+num[i])/2;
        }
        System.out.println(ans);
    }
}
