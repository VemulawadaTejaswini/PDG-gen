public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[] foo = {x, y, z};
        Arrays.sort(foo);
        System.out.print(foo[0]);
        System.out.print(" ");
        System.out.print(foo[1]);
        System.out.print(" ");
        System.out.println(foo[2]);
    }
}
