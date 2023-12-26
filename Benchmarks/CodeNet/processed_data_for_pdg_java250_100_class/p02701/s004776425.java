class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Set<String> hash_Set = new HashSet<String>(); 
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String s;
		for(int i=0;i<n;i++) {
		    s = sc.next();
		    hash_Set.add(s);
		}
    System.out.println(hash_Set.size());
	}
}
