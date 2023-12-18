public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = (int)Math.pow(num, 3);
        System.out.println(result);
        scan.close();
    }
}
