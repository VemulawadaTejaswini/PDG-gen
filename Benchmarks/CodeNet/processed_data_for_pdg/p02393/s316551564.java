public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int[] num = {a, b, c};
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }
}
