public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=1;i<=n;i++){
		    int idx = s.nextInt();
		    map.put(idx,i);
		}
		for(int i=1;i<=n;i++){
		    System.out.print(map.get(i)+" ");
		}
	}
}
