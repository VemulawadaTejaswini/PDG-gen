class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    char[] chars = s.toCharArray();
	    for(char c : chars) {
	        if(c=='1') {
	            System.out.print(9);
	        } else {
	            System.out.print(1);
	        }
	    }
	}
}
