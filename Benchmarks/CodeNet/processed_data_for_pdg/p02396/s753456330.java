public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n =1;
        while (x != 0) {
            System.out.println("Case "+n+": " + x);
            x = scan.nextInt();
            n++;
        }
    }
}
