public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        out_of_loop: while (true) {
            int a = Integer.parseInt(sc.next());
            i++;
            if (a == 0) {
                break out_of_loop;
            }
            System.out.println("Case " + i + ": " + a);
        }
        sc.close();
    }
}
