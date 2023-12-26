class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int y = (Y-2*X)/2;
        int x = X-y;
        if(y<0 || x<0 || (Y-2*X)%2!=0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
