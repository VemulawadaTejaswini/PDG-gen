class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] Args) throws IOException{
        String s = br.readLine();
        s += s;
        final String p = br.readLine();
        if(s.indexOf(p)!=-1) System.out.println("Yes");
        else System.out.println("No");
    }
}
