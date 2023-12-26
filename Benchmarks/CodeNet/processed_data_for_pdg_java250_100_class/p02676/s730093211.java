public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String s = br.readLine();
		int k = Integer.parseInt(s);
		s = br.readLine();
		int n = s.length();
		if(n <= k)
		    System.out.println(s);
		else
		{
		    for(int i=0; i<k; i++)
		        System.out.print(s.charAt(i));
		    System.out.println("...");
		}
	}
}
