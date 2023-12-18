class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int x = Integer.parseInt(num);
        int ans = x * x * x;
        System.out.println(ans);
    }
}
