public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        	List<Integer> list = new ArrayList<>();
		int x = 1;
 		while(!(x == 0))
		{
			x = scanner.nextInt();
			if(x == 0)
			{
				break;
			} 
			list.add(x);
		}
		int i = 1;
		for(Iterator it = list.iterator(); it.hasNext();) 
		{
            		System.out.println("Case" + " " + i + ":" + " " + it.next());
			i++;
       		}
	}
}	
