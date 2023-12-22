import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
  {
  	Scanner inp=new Scanner(System.in);
  	int K=inp.nextInt();
  	int T[]=new int[inp.nextInt()];
  	int a=0;
  	for(int i=0;i<T.length;i++)
  	{
  		T[i]=inp.nextInt();
  	}
  	a=T[0];
  	for(int i=0;i<T.length;i++)
  	{
  		if(a<T[i])a=T[i];
  	}
  	a=a+a-K-1;
  	if(a<0)a=0;
  	System.out.println(a);
  }
}