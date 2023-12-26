class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	    HashMap<String , Integer> map=new HashMap<>();
	    int n=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        String ans=s.next();
	        if(!map.containsKey(ans))
	        map.put(ans,1);
	    }
	    System.out.println(map.size());
	}
}
