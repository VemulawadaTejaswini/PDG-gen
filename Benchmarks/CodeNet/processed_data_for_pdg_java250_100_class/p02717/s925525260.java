public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        int guardar = x;
        x = z;
        z = y;
        y = guardar;
        System.out.println(x + " " + y + " " + z);
    }
}
