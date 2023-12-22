import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        
        boolean flag=true;
        int n_cnt,output=-1;
        int i;
        int[] n;
        n = new int[200];
        
        Scanner scan = new Scanner(System.in);

        n_cnt=scan.nextInt();
        for(i=0;i<n_cnt;i++)
        {
            n[i]=scan.nextInt();
        }

        while(flag)
        {
            output++;
            for(i=0;i<n_cnt;i++)
            {
                if(n[i]%2==0)
                {
                    n[i]/=2;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
        }
        
        System.out.println(output);

    }
}