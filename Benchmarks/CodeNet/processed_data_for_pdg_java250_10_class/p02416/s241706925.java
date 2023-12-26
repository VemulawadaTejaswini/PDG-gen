class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        while(true){
            final String in = br.readLine();
            if(in.equals("0")) break;
            int ans = 0;
            for(int i = 0; i<in.length(); i++){
                ans += in.charAt(i)-'0';
            }
            out.println(ans);
        }
        out.flush();
    }
}
