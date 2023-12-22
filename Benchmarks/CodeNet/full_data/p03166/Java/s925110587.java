import java.util.*;
public class Main
{
    @SuppressWarnings("unchecked")
    public static void main(String args[])throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>[]> yum=new ArrayList<ArrayList<Integer>[]>();int curr=0;boolean bool=false;ArrayList<Integer> pow2=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer> > nonzero=new ArrayList<ArrayList<Integer>>();
        {
            ArrayList<Integer> nz=new ArrayList<Integer>();
            ArrayList<Integer>[] h = new ArrayList[n];
            for (int i = 0; i < n; i++)
            {
                h[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < m; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                h[y - 1].add(x - 1);
                bool = true;
            }
            for(int i=0;i<n;i++)
            {
                if(h[i].size()==0)
                    h[i]=null;
                else
                    nz.add(i);
            }
            yum.add(h);
            nonzero.add(nz);
            pow2.add(1);
        }
        while(bool)
        {
            pow2.add(2*pow2.get(curr));
            bool=false;
            ArrayList<Integer>[] h = new ArrayList[n];
            ArrayList<Integer> nz=new ArrayList<Integer>();
            ArrayList<Integer>[] prev=yum.get(curr);
            ArrayList<Integer> prevnz=nonzero.get(curr);
            for(int i=0;i<prevnz.size();i++)
            {
                boolean foun=false;
                for(int j=0;j<prev[prevnz.get(i)].size();j++)
                {
                    for(int k=0;prev[prev[prevnz.get(i)].get(j)]!=null&&k<prev[prev[prevnz.get(i)].get(j)].size();k++)
                    {
                        if(!foun)
                        {
                            h[prevnz.get(i)] = new ArrayList<Integer>();
                            nz.add(prevnz.get(i));
                            foun=true;
                        }
                        h[prevnz.get(i)].add(prev[prev[prevnz.get(i)].get(j)].get(k));
                        bool=true;
                    }
                }
            }
            nonzero.add(nz);
            yum.add(h);
            curr++;
        }
        curr--;ArrayList<Integer>[] a;ArrayList<Integer>[] b;ArrayList<Integer>[] c;ArrayList<Integer> currnz, nextnz;
        int val=pow2.get(curr);
        int delta=curr-1;
        currnz=nonzero.get(curr);
        a=yum.get(curr);
        while(delta>=0)
        {
            bool=false;
            b=yum.get(delta);
            nextnz=new ArrayList<Integer>();
            c=new ArrayList[n];
            for(int i=0;i<currnz.size();i++)
            {
                boolean foun=false;
                for(int j=0;j<a[currnz.get(i)].size();j++)
                {
                    for(int k=0;b[a[currnz.get(i)].get(j)]!=null&&k<b[a[currnz.get(i)].get(j)].size();k++)
                    {
                        if(!foun)
                        {
                            c[currnz.get(i)] = new ArrayList<Integer>();
                            nextnz.add(currnz.get(i));
                            foun=true;
                        }
                        c[currnz.get(i)].add(b[a[currnz.get(i)].get(j)].get(k));
                        bool=true;
                    }
                }
            }
            if(bool==true)
            {
                a=c;
                currnz=nextnz;
                val=val+pow2.get(delta);
            }
            delta--;
        }
        System.out.println(val);
    }
}