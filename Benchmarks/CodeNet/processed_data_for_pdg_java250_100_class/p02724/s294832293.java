public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        sc.close();
        int happy500 = 1000 * (X / 500);
        X -= 500 * (X / 500);
        int happy5 = 5 * (X / 5);
        System.out.println(happy500 + happy5);
    }
}
