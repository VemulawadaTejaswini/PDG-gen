public class Main
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int num = 2*c + 2*d;
        System.out.println(c*d +" "+ num);
    }
}
