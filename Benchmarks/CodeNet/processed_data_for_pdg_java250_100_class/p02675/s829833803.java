public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem = n%10;
		if(rem == 2 || rem == 4 || rem == 7 || rem == 9 || rem ==5){
			System.out.println("hon");
		}
		else if(rem == 0 || rem == 1 || rem == 6 || rem == 8){
			System.out.println("pon");
		}
		else{
			System.out.println("bon");
		}
	}
}
