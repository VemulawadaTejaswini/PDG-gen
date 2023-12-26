class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
		String ans = "";
    	for (int i = 0; i < line.length(); i++) {
    		String s = line.substring(i, i+1);
    		if (s.equals(s.toUpperCase())) {
    			ans += s.toLowerCase();
    		}
    		else {
    			ans += s.toUpperCase();
    		}
    	}   
    	System.out.println(ans);
	}
}
