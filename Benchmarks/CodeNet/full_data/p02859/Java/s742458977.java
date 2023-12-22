public class Calc
{
    public static void main(String[] args) throws IOException
    {
        int ans = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = null;

        str = br.readLine();

        int r = Integer.parseInt(str);

        ans = r*r;

        System.out.println(ans);
    }

}