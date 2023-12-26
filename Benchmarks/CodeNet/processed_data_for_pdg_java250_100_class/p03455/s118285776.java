public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int ans = a * b;
        if((ans % 2) == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
