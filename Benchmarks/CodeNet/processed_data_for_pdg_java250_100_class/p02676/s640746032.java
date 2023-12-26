public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int k=Integer.valueOf(s);
		s=br.readLine();
		int n=s.length();
		if(n<=k)
			System.out.println(s);
		else
		{
			String t=s.substring(0,k);
			t=t+"...";
			System.out.println(t);
		}
	}
}
