class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	String[] strArraySub = str.split("");
    	int sval;
    	int val = strArraySub.length;
    	for (int i = 1; i <= val; i++) {
    		sval = val - i;
    		System.out.print(strArraySub[sval]);
		}System.out.println("");
	}
}
