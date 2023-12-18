class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();
        int x = Integer.parseInt(str);
        int ans = x*x*x;
        System.out.println(ans);
    }
}
