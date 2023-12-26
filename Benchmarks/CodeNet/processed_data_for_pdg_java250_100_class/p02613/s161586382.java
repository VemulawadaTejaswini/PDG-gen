public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int w=0,x=0,y=0,z=0;
		for(int i=0; i<n; i++)
		{
		    s = br.readLine();
		    char l = s.charAt(0);
		    if(l == 'A')
		        w++;
		    else if(l == 'W')
		        x++;
		    else if(l == 'T')
		        y++;
		    else 
		        z++;
		}
		System.out.println("AC x "+ w);
		System.out.println("WA x "+ x);
		System.out.println("TLE x "+ y);
		System.out.println("RE x "+ z);
	}
}
