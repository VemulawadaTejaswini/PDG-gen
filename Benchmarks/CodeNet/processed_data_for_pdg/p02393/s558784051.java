public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        Arrays.sort(num);
        System.out.println(num[0]+" "+num[1]+" "+num[2]);
        sc.close();
    }
}
