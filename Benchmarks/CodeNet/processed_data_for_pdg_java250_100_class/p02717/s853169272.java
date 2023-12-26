public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        int tmp = 0;
        x = sn.nextInt();
        y = sn.nextInt();
        z = sn.nextInt();
        tmp = x;
        x = y;
        y = tmp;
        tmp = x;
        x = z;
        z = tmp;
        System.out.print(x + " " + y + " " + z);
    }
}
