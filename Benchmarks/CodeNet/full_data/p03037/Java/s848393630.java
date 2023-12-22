import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] l=new int[M];
        int[] r=new int[M];
        for(int i=0; i<M; i++)
        {
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        for(int i=1; i<=N; i++)
        {
            if(isValid(i, l, r))
            {
                count++;
            }
        }
        System.out.println(count);


    }
    static boolean isValid(int num, int[] l, int[] r)
    {
        for(int i=0; i<l.length; i++)
        {
            if(num<l[i]||num>r[i])
            {
                return false;
            }
        }
        return true;
    }

}
