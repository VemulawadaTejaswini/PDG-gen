import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        long sum=0;
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(sum>n)
            System.out.println("-1");
        else
            System.out.println(n-sum);
    }
}
