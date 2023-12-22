import java.util.*;
public class Main
{
    static class point
    {
        int a,b;
        public point(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public static  long Histo(int a[])
    {
        int i=0;int n=a.length;
        long maxArea=0;
        long area=0;
        Stack<Integer> st=new Stack<>();
        while(i<n)
        {
            
             area=0;
            if(st.empty()||a[st.peek()]<a[i])
            {
                st.push(i);
                i++;
            }
            else
            {
                  int top=st.pop();
                  area=a[top]*(st.empty()?i:i-1-st.peek());
                  maxArea=Math.max(maxArea,area);
            }
          
           
        }
        while(!st.empty())
        {
            int top=st.pop();
            area=a[top]*(st.empty()?i:i-1-st.peek());
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static  long longestRectangle(int a[][],int r,int c)
    {
        long res=Histo(a[0]);
        
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]+=a[i-1][j];
            }
            res=Math.max(res,Histo(a[i]));
        }
        return res;
    }
    public static int[][] getMatrix(int a[][],List <point> li,int r,int c)
    {
        for (int i = 0; i < r-1; i++) 
        {
            for(int j = 0; j < c-1; j++)
            {
                if((a[i][j]+a[i][j+1]+a[i+1][j]+a[i+1][j+1])%2==1) 
                    continue;
                else
                {
                     if(a[i][j]==0)
                        li.add(new point(i,j));
                     if(a[i][j+1]==0)
                        li.add(new point(i,j));
                     if(a[i+1][j]==0)
                        li.add(new point(i,j));
                     if(a[i+1][j+1]==0)
                        li.add(new point(i,j));
                }
            }
        }
        for(point p:li)
        {
            int x=p.a;
            int y=p.b;
            a[x][y]=1;
        }
        return a;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            String line=sc.next();
            for (int j = 0; j < c; j++) {
                char temp=line.charAt(j);
               if(temp=='#')
               {
                    arr[i][j]=0;
               }
               else
               {
                    arr[i][j]=1;
               }
            }
        }
        List<point> li=new ArrayList<>();
        int[][] a=getMatrix(arr,li,r,c);
        long ans=longestRectangle(a,r,c);
        System.out.println(ans);
    }
}