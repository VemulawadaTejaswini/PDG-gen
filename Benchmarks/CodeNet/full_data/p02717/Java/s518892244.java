import java.util.*;
class Main
{
    boolean abc(int n)
    {
        int a=0;
        int copy=n;int c=0;
        while(copy>0)
        {
            copy/=10;
            a++;
        }
        int arr[]=new int[a];
        copy=n;
        int p=0;
        while(copy>0)
        {
            arr[p++]=copy%10;
            copy/=10;
        }
        if(p>1) {
            for(int i=0;i<p-1;i++)
            {

                if(arr[i]-arr[i+1]==0||arr[i]-arr[i+1]==1||arr[i]-arr[i+1]==(-1))
                    c=1;
                else
                    c=0;
            }}
        if(c==1||p==1)
            return true;
        else return false;
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Main ob=new Main();
        int c=0;int t=1;
        int p=0;
        while(true)
        {
            p++;
            if(ob.abc(p)==true)
                c++;

            if(c==k)
                break;
        }
        System.out.println(p);
    }
}

        