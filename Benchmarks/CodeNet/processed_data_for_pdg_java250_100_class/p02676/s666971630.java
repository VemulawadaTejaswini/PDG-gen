public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
      	if(str.length() <= n){
      		System.out.println(str);
      	}
      	else{
      		System.out.println(str.substring(0,n)+"...");
      	}
	}
}
