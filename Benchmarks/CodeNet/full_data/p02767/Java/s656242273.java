class Main
{
  public static void main(String args[])
  {
    int i=0,j=0,k,l,m=0,n=0;
     Scanner myObj = new Scanner(System.in);
     i = myObj.nextInt();
     int a[]=new int[i];
     for(j=0;j<i;j++)
     {
     	a[j]=myObj.nextInt();
     	if(a[j]>m)
     		m=a[j];
     }
     if(m%2!=0)
     	m=(m-1)/2;
     else
     	m=m/2;
    for(j=0;j<i;j++)
    {
    	n=n+(a[j]-m)*(a[j]-m);
    }
    System.out.println(n);
  }
}
    



