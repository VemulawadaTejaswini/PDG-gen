class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        HashSet<String> hs=new HashSet<>();
        while(t-- > 0)
        {
        	String s=br.readLine();
        	hs.add(s);
        }
        System.out.println(hs.size());
    }
}
