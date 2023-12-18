class Main
{
    public static void main(String args[])
    {
	int i,j=1;
Scanner scan=new Scanner(System.in);
	while(true)
	    {
		i=scan.nextInt();
		if(i==0)break;
		System.out.println("Case "+j+": "+i);
		j++;
	    }
    }
}
