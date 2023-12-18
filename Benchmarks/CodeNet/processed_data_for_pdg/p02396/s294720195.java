public class Main
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; ;i++)
        {
            int x = sc.nextInt();
            if(x!=0) System.out.println("Case "+i+": "+x);
            else break;
        }
        sc.close();
    }
}
