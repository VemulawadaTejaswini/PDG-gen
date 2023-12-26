class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		data1 = data1 * data2;
		if(data1 % 2==0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}
}
