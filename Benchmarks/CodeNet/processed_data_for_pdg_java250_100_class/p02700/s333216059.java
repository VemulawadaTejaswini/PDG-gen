class Main {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c,d;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		do{
		    c=c-b;
		    if(c<=0)
		        break;
		    a=a-d;
		    if(a<=0)
		        break;
		}while(c>0 && a>0);
		if(c<=0)
		     System.out.println("Yes");
		 else
		    System.out.println("No");
		input.close();
	}
}
