class Main
{
		public static void main(String args[])
		{
                    int n,c=0;
                    Scanner sc= new Scanner(System.in);
                    n=sc.nextInt(); 
                    int a[]=new int[n];
                    for(int i=0;i<n;i++)
                    {
                        a[i]=sc.nextInt();
                    }
                    for(int i=0;i<n;i++)
                    {
                        if(a[i]%2==0)
                        {
                            if(a[i]%3==0 || a[i]%5==0)
                            {
                            }
                            else
                            {
                                c++;
                            }
                        }
                    }
                    if(c>0)
                    {
                        System.out.println("DENIED");
                    }
                    else
                    {
                        System.out.println("APPROVED");
                    }
                }}     
