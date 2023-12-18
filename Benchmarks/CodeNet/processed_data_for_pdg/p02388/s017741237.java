class Main {
    public static void main( String[] args ) throws IOException 
    {
        String line;
        int x;
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        line = br.readLine();
        x = Integer.parseInt( line );
        System.out.println( x*x*x );
    }
}
