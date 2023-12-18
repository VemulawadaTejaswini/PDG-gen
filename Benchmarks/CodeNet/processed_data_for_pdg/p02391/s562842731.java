public class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String aa = sc.next();
        String bb = sc.next();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        if (a > b)
        {
            System.out.println("a > b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }
        else
        {
            System.out.println("a == b");
        }
    }
}
