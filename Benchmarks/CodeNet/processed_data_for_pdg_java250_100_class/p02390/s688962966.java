public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String line = stdReader.readLine();
        int a = Integer.parseInt(line);
        System.out.println( (a / 3600) + ":" + ( (a / 60) % 60 ) +":" + (a % 60) );
	}
}
