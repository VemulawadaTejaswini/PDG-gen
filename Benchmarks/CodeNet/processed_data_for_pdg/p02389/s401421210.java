class Main{
    public static void main(String[] args) throws Exception{
        String[] str;
        int x;
        int y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = (br.readLine()).split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
        System.out.println(x*y + " " + (x*2 + y*2));
    }
}
