import java.util.*;
public class Main
{
    public static void main(String args[])throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=input(sc);
        int m=input(sc);
        int original[],a[]=new int[n],b[]=new int[n];LinkedList incom[]=new LinkedList[n];boolean bool=false;int ans=1;
        for(int i=0;i<n;i++)
        {
            incom[i]=new LinkedList();
            a[i]=0;
        }
        for(int i=0;i<m;i++)
        {
            int x=input(sc);
            int y=input(sc);
            incom[y-1].add(x-1);
            a[y-1]=1;
            bool=true;
        }
        while(bool)
        {
            bool=false;
            for(int i=0;i<n;i++)
            {

                b[i]=0;
                Node nd=incom[i].root;
                while (nd!=null)
                {
                    b[i]+=a[nd.data];
                    nd=nd.next;
                }
                b[i]=signum(b[i]);
            }
            for(int i=0;i<n;i++)
            {
                if(b[i]==1)
                    bool=true;
                a[i]=b[i];
            }
            ans++;
        }
        ans--;
        System.out.println(ans);
    }
    static int input(Scanner sc)throws java.lang.Exception
    {
        if(sc.hasNextInt())
            return sc.nextInt();
        else return 0;
    }
    static int signum(int i)
    {
        if(i==0)
            return 0;
        else
            return 1;
    }
}

class Node
{
    int data;
    Node next;
    Node(int i)
    {
        data=i;
        next=null;
    }
    Node(int i,Node n)
    {
        data=i;
        next=n;
    }
}
class LinkedList
{
    Node root;
    LinkedList()
    {
        root=null;
    }
    void add(int i)
    {
        root=new Node(i,root);
    }
}