class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int x=Integer.parseInt(str);
        double y=Math.pow(x,3);
        int z=(int)y;
        System.out.println(z);
    }
}
