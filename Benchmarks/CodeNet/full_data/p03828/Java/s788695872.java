import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int k=1,mul=1,n;
HashSet<Integer>a=new HashSet<Integer>();
n=sc.nextInt();
int i,val=1;
for(i=1;i<=n;i++)
{
	val*=i;
}
int p=(val/2);
while(k<=p)
{
		if(val%k==0)
			a.add(k);
	k++;
}

System.out.println(a.size()+1);
	}

}
