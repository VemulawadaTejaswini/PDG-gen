public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader stdReader =
        	new BufferedReader(new InputStreamReader(System.in));
      	String line;
      	line = stdReader.readLine();
      	int x = Integer.parseInt(line);
      	System.out.println(x * x * x);
      	stdReader.close();
	}
}
