public class Main {
public static void main(String args[])
{
	int j;
	Scanner in = new Scanner(System.in);
	int height[]=new int[10];
	int i;
	int x;
	for(i=0;i<10;i++)
	{
		height[i]=in.nextInt();
	}
for(i=0;i<10;i++)
{
	for(j=i+1;j<10;j++)
		if(height[i]>height[j])
		{
			int temp=height[i];
			height[i]=height[j];
			height[j]=temp;
		}
}
for(i=9;i>6;i--)
{
	System.out.println(height[i]);
}
}
}
