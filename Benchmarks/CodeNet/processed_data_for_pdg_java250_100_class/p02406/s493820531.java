class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n; i++){
            int x = i;
            if(x%3==0){
                out.print(" "+i);
                continue;
            }
            do{
                if(x%10==3){
                    out.print(" "+i);
                    break;
                }
                x /= 10;
            }while(x!=0);
        }
        out.println();
        out.flush();
    }
}
