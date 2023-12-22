import java.io.*;
import java.util.*;
class Test
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int h=sc.nextInt();
int w=sc.nextInt();
int n=sc.nextInt();
int a[]=new int[n];
int grid[][]=new int[h][w];
for(int i=0;i<h;i++)
{
a[i]=sc.nextInt();
}
int x=0;
int y=0;
for(int i=0;i<n;i++)
{
while(a[i]-->0)
{
grid[x][y]=i+1;
if(x%2==0)
{
if(y==w-1)
x++;
else
y++;
}
else
{
if(y==0)
x++;
else
y++;
}
}
}
for(int i=0;i<h;i++)
{
for(int j=0;j<w;j++)
{
System.out.print(grid[i][j]);
}
System.out.println();
}
}
}
