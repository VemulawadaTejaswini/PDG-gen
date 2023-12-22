public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int c=0,x,y,z,k,s;
k=sc.nextInt();
s=sc.nextInt();
for(x=0;x<=s;i++)
{
	for(y=0;y<=s;y++)
	{
		for(z=0;z<=s;z++)
		{
			if((x+y+z)==s)
              c++;
		}
	}

}

System.out.println(c);
	}
}
