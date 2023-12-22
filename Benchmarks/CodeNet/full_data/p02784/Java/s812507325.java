import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int m=sc.nextInt();
        int n[]=new int[m];
        long all=0;
        for(int i=0;i<m;i++) {
            n[i] = sc.nextInt();
            all += n[i];
        }
        if(all>=a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}