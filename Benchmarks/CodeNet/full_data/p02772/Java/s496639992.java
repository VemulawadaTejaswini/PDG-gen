import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        int a[]=new int[m];
        int flag=0;
        int count=0;
        for(int i=0;i<m;i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                count++;
                if (a[i] % 3 == 0 || a[i] % 5 == 0)
                    flag++;
            }
        }
        if(flag==count)
            System.out.println("APPROVED");
        else
            System.out.println("DENIED");
    }
}
