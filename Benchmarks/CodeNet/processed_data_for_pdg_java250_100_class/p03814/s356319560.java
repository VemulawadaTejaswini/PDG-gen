class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner SC=new Scanner(System.in);
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     PrintWriter pw=new PrintWriter(System.out);
	     int t=0;
	     String s;
	     s=br.readLine();
	     int n=s.lastIndexOf("Z")-s.indexOf("A");
	     pw.println((n+1));
	     pw.close();     
}
}
